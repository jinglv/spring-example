package com.example.aop.proxy.jdk;

import com.example.aop.proxy.jdk.dao.UserDao;
import com.example.aop.proxy.jdk.dao.UserDaoImpl;
import org.junit.jupiter.api.Test;

/**
 * jdk动态代理测试类
 *
 * @author jinglv
 * @date 2021/04/03
 */
class MyJdkProxyTest {

    @Test
    void test() {
        UserDaoImpl userDao = new UserDaoImpl();

        // 代理对象
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();

        proxy.save();
        proxy.update();
        proxy.update();
        proxy.find();
    }
}