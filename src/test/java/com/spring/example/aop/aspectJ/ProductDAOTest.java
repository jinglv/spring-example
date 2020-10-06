package com.spring.example.aop.aspectJ;

import com.spring.example.aop.aspectJ.anno.ProductDAO;
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
@ContextConfiguration("classpath:spring-aspectJ.xml")
public class ProductDAOTest {

    @Autowired
    private ProductDAO productDAO;

    @Test
    public void test(){
        productDAO.save();
        productDAO.update();
        productDAO.delete();
        productDAO.findOne();
        productDAO.findAll();
    }

}