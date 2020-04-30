package com.spring.example.aop.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jingLv
 * @date 2020-04-29 1:55 下午
 */
public class MyJdkProxy implements InvocationHandler {

    private UserDao userDao;

    public MyJdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public Object createProxy() {
        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("权限校验...");
            return method.invoke(userDao, args);
        }
        return method.invoke(userDao, args);
    }
}
