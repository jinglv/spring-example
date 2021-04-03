package com.example.factory.demo.service;

/**
 * @author jinglv
 * @date 2020/12/20
 */
public class UserServiceImpl implements UserService {

    /**
     * 添加属性
     */
    private String name;

    /**
     * say hello的实现方法
     */
    @Override
    public void sayHello() {
        System.out.println("Hello Spring：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
