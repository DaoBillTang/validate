package com.dtb.validate.model;

import com.dtb.validate.enums.ResultType;

import java.util.ArrayList;
import java.util.List;

import static com.dtb.validate.enums.ResultType.SUCCESS;
import static com.dtb.validate.enums.ResultType.WAIT;

/**
 * 返回结果
 * 可以使用结果
 */
public class ValidateResult {

    private List<String> errMsg;
    private ResultType status = WAIT;

    private ErrListener mListener;

    interface ErrCallBack {
        void onErr(List<String> errMsg);
    }

    interface ErrListener {
        void onErr(String msg);
    }


    public ValidateResult() {
        this.errMsg = new ArrayList<>();
    }

    public ErrListener getListener() {
        return mListener;
    }

    public void setListener(ErrListener mListener) {
        this.mListener = mListener;
    }

    public List<String> getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(List<String> errMsg) {
        this.errMsg = errMsg;
    }

    public ResultType getStatus() {
        return status;
    }

    public void setStatus(ResultType status) {
        this.status = status;
    }

    public void setErr(String err) {
        this.errMsg.add(err);
        if (null != mListener) {
            mListener.onErr(err);
        }
    }

    public String first() {
        return errMsg.get(0);
    }

    public boolean isValidateSuccess() {
        return getStatus() == SUCCESS;
    }

    public void doWithCallBack(ErrCallBack call) {
        if (!isValidateSuccess()) {
            call.onErr(getErrMsg());
        }
    }
}
