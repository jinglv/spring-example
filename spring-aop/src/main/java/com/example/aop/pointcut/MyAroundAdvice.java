package com.example.aop.pointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 自定义带有切入点的环绕增强
 *
 * @author jinglv
 * @date 2021/04/04
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
