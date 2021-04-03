package com.example.factory.demo;

import com.example.factory.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 读取磁盘系统中的配置文件
 *
 * @author jinglv
 * @date 2020/12/27
 */
public class FactoryFileTest {
    public static void main(String[] args) {
        // 创建Spring的工厂类
        ApplicationContext context = new FileSystemXmlApplicationContext("spring-bean-factory/applicationContext.xml");
        // 通过工厂类获得类
        UserService userService = (UserService) context.getBean("userService");
        userService.sayHello();
    }
}
