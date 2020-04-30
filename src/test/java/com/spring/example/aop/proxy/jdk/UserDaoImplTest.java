package com.spring.example.aop.proxy.jdk;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-29 1:53 下午
 */
public class UserDaoImplTest {

    @Test
    public void demo1() {
        UserDaoImpl userDao = new UserDaoImpl();

        //代理对象
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();

        proxy.save();
        proxy.update();
        proxy.update();
        proxy.find();
    }

}