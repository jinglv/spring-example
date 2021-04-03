package com.example.bean.demo.all;

import javax.annotation.Resource;

/**
 * @author jinglv
 * @date 2021/01/28
 */
public class ProductService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    @Resource(name = "productDao")
    private ProductDao productDao;

    public void save() {
        System.out.println("ProductService的save方法……");
        categoryDao.save();
        productDao.save();
    }
}
