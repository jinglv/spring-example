package com.spring.example.bean.lifecycle;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-26 11:28 AM
 */
public class ManTest extends UnitTestBase {

    public ManTest() {
        super("spring-lifecycle.xml");
    }

    @Test
    public void testMan() {
        Man man = super.getBean("man");
        man.run();
    }

    @Test
    public void testUser() {
        UserDao userDao = getBean("userDao");
        userDao.findAll();
        userDao.save();
        userDao.update();
        userDao.delete();
    }

}