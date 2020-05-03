package com.spring.example.aop.autoadvisor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author jinglv
 * @date 2020-05-03 14:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-auto-advisor.xml")
public class CustomerDaoTest {

    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void test(){
        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();

        customerDao.find();
        customerDao.save();
        customerDao.update();
        customerDao.delete();
    }

}