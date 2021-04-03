package com.example.bean.demo.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围的测试
 *
 * @author jinglv
 * @date 2020/12/27
 */
class PersonTest {

    @Test
    void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-scope.xml");
        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println(person1);
        System.out.println(person2);
    }
}