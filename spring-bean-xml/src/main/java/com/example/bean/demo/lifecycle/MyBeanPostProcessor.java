package com.example.bean.demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jingLv
 * @date 2020-04-26 11:48 AM
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：初始化前方法...");
        return bean;
    }

    /**
     * 对 postProcessAfterInitialization 初始化后方法进行增强。
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第八步：初始化后方法...");
        //使用代理，构造匿名函数
        if ("userDao".equals(beanName)) {
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    // save方法之前进行增强
                    if ("save".equals(method.getName())) {
                        System.out.println("权限校验==========");
                        // 传入属性
                        return method.invoke(bean, args);
                    }
                    return method.invoke(bean, args);
                }
            });
            return proxy;
        } else {
            return bean;
        }
    }
}
