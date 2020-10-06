package com.spring.example.aop.aspectJ.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 *
 * @author jinglv
 * @date 2020/10/06
 */
@Aspect
public class ProductAspectAnno {

    /**
     * 每个方法之前都进行前置增强
     */
    @Before(value = "pointcutSave() || pointcutUpdate()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知===" + joinPoint);
    }

    @AfterReturning(value = "execution(* com.spring.example.aop.aspectJ.anno.ProductDAO.update(..))", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("后置通知===" + result);
    }

    @Around(value = "execution(* com.spring.example.aop.aspectJ.anno.ProductDAO.delete(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object proceed = null;
        try {
            System.out.println("环绕前通知===");
            // 执行目标方法
            proceed = proceedingJoinPoint.proceed();
            System.out.println("环绕后通知===");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }

    @AfterThrowing(value = "execution(* com.spring.example.aop.aspectJ.anno.ProductDAO.findOne(..))", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("异常抛出通知====" + e.getMessage());
    }

    @After(value = "execution(* com.spring.example.aop.aspectJ.anno.ProductDAO.findAll(..))")
    public void after() {
        System.out.println("最终通知===");
    }

    @Pointcut(value = "execution(* com.spring.example.aop.aspectJ.anno.ProductDAO.save(..))")
    private void pointcutSave() {}

    @Pointcut(value = "execution(* com.spring.example.aop.aspectJ.anno.ProductDAO.update(..))")
    private void pointcutUpdate() {}
}
