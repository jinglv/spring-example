package com.example.aspectJ.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 自定义AspectJ XML方式，切面类
 *
 * @author jinglv
 * @date 2021/04/05
 */
public class CustomerAspectXml {
    /**
     * 前置通知
     */
    public void before(JoinPoint joinPoint) {
        System.out.println("XML方式前置通知=========" + joinPoint);
    }

    /**
     * 后置通知
     */
    public void afterReturning(Object result) {
        System.out.println("XML方式后置通知=========" + result);
    }

    /**
     * 环绕通知
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("XML方式环绕前通知=========");
        Object obj = joinPoint.proceed();
        System.out.println("XML方式环绕后通知=========");
        return obj;
    }

    /**
     * 异常抛出通知
     */
    public void afterThrowing(Throwable e) {
        System.out.println("XML方式异常抛出通知=========" + e.getMessage());
    }

    /**
     * 最终通知
     */
    public void after(JoinPoint joinPoint) {
        System.out.println("XML方式最终通知=========" + joinPoint);
    }
}
