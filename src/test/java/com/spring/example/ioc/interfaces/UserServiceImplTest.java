package com.spring.example.ioc.interfaces;

import com.spring.example.base.UnitTestBase;
import com.spring.example.ioc.interfaces.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * 传统开发与IOC比较
 *
 * @author jingLv
 * @date 2020-04-21 11:24 PM
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class UserServiceImplTest extends UnitTestBase {

    public UserServiceImplTest() {
        super("classpath*:spring-ioc.xml");
    }

    /**
     * 传统模式开发
     */
    @Test
    public void testSay() {
        UserServiceImpl userService = new UserServiceImpl();
        // 传统方式需要修改源代码，会有强耦合性
        userService.setName("杨二车娜姆");
        userService.say("Hello");
    }

    @Test
    public void testSayIOC() {
        UserService userService = super.getBean("userService");
        userService.say("Hello");
    }


}