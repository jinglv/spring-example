package com.spring.example.bean.annotation;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-26 1:19 PM
 */
public class UserServiceTest extends UnitTestBase {

    public UserServiceTest(){
        super("spring-annotation.xml");
    }

    @Test
    public void testUserService(){
        UserService userService = super.getBean("userService");
        String s = userService.sayHello("凤姐");
        System.out.println(s);
    }

    @Test
    public void testUserEatService(){
        UserService userService = super.getBean("userService");
        userService.eat();
    }

    @Test
    public void testUserSaveService(){
        UserService userService = super.getBean("userService");
        userService.save();
    }
}