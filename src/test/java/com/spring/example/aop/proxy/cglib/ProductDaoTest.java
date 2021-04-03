package com.spring.example.aop.proxy.cglib;

import org.junit.jupiter.api.Test;

/**
 * @author jingLv
 * @date 2020-04-30 12:48 下午
 */
public class ProductDaoTest {

    @Test
    public void test() {
        ProductDao productDao = new ProductDao();

        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}