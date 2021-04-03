package com.example.bean.demo.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2020/12/27
 */
class ManTest {

    @Test
    void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        Man man = (Man) context.getBean("man");
        man.run();
        context.close();
    }

}