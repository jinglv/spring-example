package com.spring.example.aop.autoadvisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置增强
 *
 * @author jinglv
 * @date 2020-05-03 13:36
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知...");
    }
}
