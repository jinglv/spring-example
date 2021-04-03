package com.example.bean.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/12
 */
class PersonTest {

    @Test
    void testPerson() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}