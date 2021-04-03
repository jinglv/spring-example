package com.example.bean.demo.spel;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/17
 */
class ProductTest {

    @Test
    void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-spel.xml");
        Product product = (Product) context.getBean("product");
        System.out.println(product);
    }

}