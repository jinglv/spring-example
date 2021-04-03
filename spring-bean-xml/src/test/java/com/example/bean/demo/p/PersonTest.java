package com.example.bean.demo.p;

import com.example.bean.demo.di.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/17
 */
public class PersonTest {

    @Test
    void testPerson() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-p.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
