package com.spring.example.aop.autoadvisor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;


/**
 * @author jinglv
 * @date 2020-05-03 14:53
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-auto-advisor.xml")
public class CustomerDaoTest {

    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void test() {
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