package com.example.bean.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/25
 */
class BeanScopeTest {

    @Test
    void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanScope bean1 = (BeanScope) context.getBean("beanScope");
        BeanScope bean2 = (BeanScope) context.getBean("beanScope");
        System.out.println(bean1 == bean2);
    }

}