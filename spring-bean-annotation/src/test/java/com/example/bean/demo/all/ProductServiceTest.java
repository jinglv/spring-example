package com.example.bean.demo.all;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/28
 */
class ProductServiceTest {

    /**
     * XML方式，set方式注入
     */
    @Test
    void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-all.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        productService.save();
    }

}