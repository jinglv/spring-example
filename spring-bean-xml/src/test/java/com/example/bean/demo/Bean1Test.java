package com.example.bean.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化的三种方式：采用无参数的构造方法的方式测试
 *
 * @author jinglv
 * @date 2020/12/27
 */
class Bean1Test {
    @Test
    void testBean1() {
        // 创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类的实例
        Bean1 bean1 = (Bean1) context.getBean("bean1");
    }
}