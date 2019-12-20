package com.example.validatordemo.Annotation;

import java.lang.annotation.*;

/**
 * 校验请求头中的值是否为空,方法注解和类注解
 */
@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface HeaderChecker {
    /**
     * default:默认校验授权相关请求头
     * @return
     */
    String[] headerNames() default {"AppAuthInfo"};

}
