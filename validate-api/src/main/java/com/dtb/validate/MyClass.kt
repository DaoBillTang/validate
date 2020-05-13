package com.dtb.validate

import com.dtb.validate.annotation.Validate
import com.dtb.validate.annotation.ValidateBean
import com.dtb.validate.annotation.ValidateRule
import com.dtb.validate.enums.ValidateType

@ValidateBean
public class MyClass {

    @Validate(rules = [ValidateRule(ruleType = ValidateType.EQ, errMsg = "不相等", other = "10")])
    var A: String? = null


}
