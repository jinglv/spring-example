package com.example.aop.advisor;

import com.example.aop.advisor.dao.StudentDao;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * 自定义前置增强测试类
 *
 * @author jinglv
 * @date 2021/04/04
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-advisor.xml")
class Test {
    // @Resource(name = "studentDao") // 注入不增强的
    @Resource(name = "studentDaoProxy") // 注入增强的
    private StudentDao studentDao;

    @org.junit.jupiter.api.Test
    void before() {
        studentDao.save();
        studentDao.find();
        studentDao.update();
        studentDao.delete();
    }
}