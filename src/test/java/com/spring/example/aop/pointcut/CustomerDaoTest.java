package com.spring.example.aop.pointcut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author jinglv
 * @date 2020-05-03 14:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-pointcut.xml")
public class CustomerDaoTest {

    //@Resource(name = "customerDao")
    @Resource(name = "customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void test(){
        customerDao.find();
        customerDao.save();
        customerDao.update();
        customerDao.delete();
    }

}