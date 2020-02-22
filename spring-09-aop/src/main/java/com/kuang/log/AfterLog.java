package com.kuang.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    //带返回值
    public void afterReturning(@Nullable Object o, Method method, Object[] objects, @Nullable Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"======返回的结果为："+o);
    }
}
