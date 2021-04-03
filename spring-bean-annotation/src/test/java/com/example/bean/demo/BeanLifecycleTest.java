package com.example.bean.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/25
 */
class BeanLifecycleTest {

    @Test
    void say() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanLifecycle beanLifecycle = (BeanLifecycle) context.getBean("beanLifecycle");
        beanLifecycle.say();
        // 工厂关闭
        context.close();
    }
}