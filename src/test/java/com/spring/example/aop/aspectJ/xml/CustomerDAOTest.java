package com.spring.example.aop.aspectJ.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jinglv
 * @date 2020/10/06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-aspectJ-xml.xml")
public class CustomerDAOTest {

    @Autowired
    private CustomerDAO customerDAO;

    @Test
    public void test(){
        customerDAO.save();
        customerDAO.update();
        customerDAO.delete();
        customerDAO.findOne();
        customerDAO.findAll();
    }

}