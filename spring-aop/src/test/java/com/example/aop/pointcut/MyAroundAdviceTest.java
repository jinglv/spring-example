package com.example.aop.pointcut;

import com.example.aop.pointcut.dao.CustomerDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @author jinglv
 * @date 2021/04/04
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-pointcut.xml")
class MyAroundAdviceTest {
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