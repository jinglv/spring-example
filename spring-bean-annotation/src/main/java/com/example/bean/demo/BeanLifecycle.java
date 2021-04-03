package com.example.bean.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Bean的生命周期
 *
 * @author jinglv
 * @date 2021/01/25
 */
@Component("beanLifecycle")
public class BeanLifecycle {

    /**
     * 初始化
     */
    public void init() {
        System.out.println("initBean...");
    }

    public void say() {
        System.out.println("hello...");
    }

    /**
     * 销毁
     */
    @PreDestroy
    public void destroy() {
        System.out.println("destroyBean...");
    }
}
