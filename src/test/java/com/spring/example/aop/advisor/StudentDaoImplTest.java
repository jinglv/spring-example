package com.spring.example.aop.advisor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author jinglv
 * @date 2020-05-03 13:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-advisor.xml")
public class StudentDaoImplTest {

    // @Resource(name = "studentDao") // 注入不增强的
    @Resource(name = "studentDaoProxy") // 注入增强的
    private StudentDao studentDao;

    @Test
    public void test() {
        studentDao.save();
        studentDao.find();
        studentDao.update();
        studentDao.delete();
    }

}