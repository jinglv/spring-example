package com.spring.example.aop.advisor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;


/**
 * @author jinglv
 * @date 2020-05-03 13:45
 */
@ExtendWith(SpringExtension.class)
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