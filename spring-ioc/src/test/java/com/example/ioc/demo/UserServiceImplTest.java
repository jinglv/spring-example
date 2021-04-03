package com.example.ioc.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2020/12/20
 */
class UserServiceImplTest {

    /**
     * 传统方式调用
     */
    @Test
    void sayHello01() {
        // 直接new实现类，接口类与实现类则有耦合关系
        // UserService userService = new UserServiceImpl();
        // 设置name，需要修改代码
        UserServiceImpl userService = new UserServiceImpl();
        // 设置属性
        userService.setName("小红");
        // 调用方法
        userService.sayHello();
    }

    /**
     * Spring的方式实现
     */
    @Test
    void sayHello02() {
        // 创建Spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        // 调用方法
        userService.sayHello();
    }
}