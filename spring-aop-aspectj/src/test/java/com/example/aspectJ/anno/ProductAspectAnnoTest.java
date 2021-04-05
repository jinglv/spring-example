package com.example.aspectJ.anno;

import com.example.aspectJ.anno.dao.ProductDAO;
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
@ContextConfiguration("classpath:spring-aspectJ.xml")
class ProductAspectAnnoTest {
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