package com.spring.example.aop.pointcut;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;


/**
 * @author jinglv
 * @date 2020-05-03 14:15
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-pointcut.xml")
public class CustomerDaoTest {

    //@Resource(name = "customerDao")
    @Resource(name = "customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void test() {
        customerDao.find();
        customerDao.save();
        customerDao.update();
        customerDao.delete();
    }

}