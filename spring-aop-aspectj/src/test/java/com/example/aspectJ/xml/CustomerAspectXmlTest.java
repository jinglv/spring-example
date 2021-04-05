package com.example.aspectJ.xml;

import com.example.aspectJ.xml.dao.CustomerDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author jinglv
 * @date 2021/04/05
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = "classpath:spring-aspectJ-xml.xml")
class CustomerAspectXmlTest {
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