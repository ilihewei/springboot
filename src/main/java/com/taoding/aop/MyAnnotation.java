package com.taoding.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: MyAnnotation
 * @Author: lihewei
 * @Date: 2019-12-24 15:20
 */
@Retention(RetentionPolicy.RUNTIME)//运行时有效
@Target(ElementType.METHOD)//作用于方法
public @interface MyAnnotation {
	String methodName () default "";
}
