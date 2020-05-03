package com.spring.example.aop.autobean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author jinglv
 * @date 2020-05-03 14:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-auto-bean.xml")
public class StudentDaoImplTest {

    @Resource(name="studentDao")
    private StudentDao studentDao;

    @Resource(name="customerDao")
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