package com.example.aop.proxy.jdk;

import com.example.aop.proxy.jdk.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author jinglv
 * @date 2021/04/03
 */
public class MyJdkProxy implements InvocationHandler {
    /**
     * 注入UserDao
     */
    private final UserDao userDao;

    /**
     * 构造方法，传入指定的UserDao
     *
     * @param userDao 用户Dao
     */
    public MyJdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 创建代理
     * 1. 获取类的加载器
     * 2. 获取实现的接口
     * 3. 传入接口的实例
     *
     * @return object
     */
    public Object createProxy() {
        return Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
    }

    /**
     * 代理方法实现
     *
     * @param proxy  代理
     * @param method 方法
     * @param args   参数
     * @return object
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("权限校验(保存方法前)...");
            return method.invoke(userDao, args);
        }
        return method.invoke(userDao, args);
    }
}
