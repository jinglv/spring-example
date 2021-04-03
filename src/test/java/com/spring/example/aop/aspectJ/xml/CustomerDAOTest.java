package com.spring.example.aop.aspectJ.xml;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author jinglv
 * @date 2020/10/06
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = "classpath:spring-aspectJ-xml.xml")
public class CustomerDAOTest {

    @Autowired
    private CustomerDAO customerDAO;

    @Test
    public void test() {
        customerDAO.save();
        customerDAO.update();
        customerDAO.delete();
        customerDAO.findOne();
        customerDAO.findAll();
    }

}