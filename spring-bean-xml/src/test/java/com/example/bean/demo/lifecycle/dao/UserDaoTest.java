package com.example.bean.demo.lifecycle.dao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2020/12/28
 */
class UserDaoTest {

    @Test
    void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beanpostprocessor.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");

        userDao.findAll();
        userDao.save();
        userDao.update();
        userDao.delete();
    }

}