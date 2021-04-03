package com.example.factory.demo.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 传统方式工厂类：BeanFactory
 *
 * @author jinglv
 * @date 2020/12/27
 */
public class FactoryBeanTest {

    public static void main(String[] args) {
        // 创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        // 通过工厂类获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }
}
