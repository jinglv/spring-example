package com.example.aop.auto.advisor;

import com.example.aop.auto.advisor.dao.CustomerDao;
import com.example.aop.auto.advisor.dao.StudentDao;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @author jinglv
 * @date 2021/04/04
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-auto-advisor.xml")
class Test {
    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @org.junit.jupiter.api.Test
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