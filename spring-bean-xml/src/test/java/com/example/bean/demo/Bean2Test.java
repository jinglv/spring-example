package com.example.bean.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化的三种方式：静态工厂方式测试
 *
 * @author jinglv
 * @date 2020/12/27
 */
class Bean2Test {
    @Test
    void testBean2() {
        // 创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类的实例
        Bean2 bean2 = (Bean2) context.getBean("bean2");
    }
}