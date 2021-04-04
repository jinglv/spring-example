package com.example.aop.auto.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author jinglv
 * @date 2020-05-03 14:06
 */
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前增强===");
        // 执行目标方法
        Object o = methodInvocation.proceed();
        System.out.println("环绕后增强===");
        return o;
    }
}
