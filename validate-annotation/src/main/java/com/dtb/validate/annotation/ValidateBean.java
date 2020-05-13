package com.dtb.validate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 指明当前类为 需要生成 代码的类
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface ValidateBean {
}
