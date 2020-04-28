package com.spring.example.bean.all;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-27 12:40 PM
 */
public class ProductServiceTest extends UnitTestBase {

    public ProductServiceTest() {
        super("spring-annotation.xml");
    }

    @Test
    public void save() {
        ProductService productService = super.getBean("productService");
        productService.save();
    }
}