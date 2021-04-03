package com.example.bean.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化的三种方式：实例工厂方式测试
 *
 * @author jinglv
 * @date 2020/12/27
 */
class Bean3Test {
    @Test
    void testBean3() {
        // 创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类的实例
        Bean3 bean3 = (Bean3) context.getBean("bean3");
    }
}