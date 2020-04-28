package com.spring.example.bean.all;

import javax.annotation.Resource;

/**
 * @author jingLv
 * @date 2020-04-27 12:32 PM
 */
public class ProductService {

    @Resource(name = "productDao")
    private ProductDao productDao;

    @Resource(name = "categoryDao")
    private  CategoryDao categoryDao;

    public void save(){
        System.out.println("ProductService的save方法执行了...");

        productDao.save();
        categoryDao.save();
    }
}
