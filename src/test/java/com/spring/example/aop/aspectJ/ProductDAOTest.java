package com.spring.example.aop.aspectJ;

import com.spring.example.aop.aspectJ.anno.ProductDAO;
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
@ContextConfiguration("classpath:spring-aspectJ.xml")
public class ProductDAOTest {

    @Autowired
    private ProductDAO productDAO;

    @Test
    public void test() {
        productDAO.save();
        productDAO.update();
        productDAO.delete();
        productDAO.findOne();
        productDAO.findAll();
    }

}