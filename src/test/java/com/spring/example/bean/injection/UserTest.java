package com.spring.example.bean.injection;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-23 9:41 PM
 */
public class UserTest extends UnitTestBase {

    public UserTest(){
        super("classpath:spring-bean-injection.xml");
    }

    @Test
    public void testUser() {
        User user = super.getBean("user");
        System.out.println(user);
    }
}