package com.example.bean.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/12
 */
class UserTest {

    @Test
    void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

}