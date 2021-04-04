package com.example.aop.proxy.cglib;

import com.example.aop.proxy.cglib.dao.ProductDao;
import org.junit.jupiter.api.Test;

/**
 * 自定义cglib代理测试类
 *
 * @author jinglv
 * @date 2021/04/04
 */
class MyCglibProxyTest {

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