package com.example.aop.proxy.cglib.dao;

/**
 * Product Dao类
 *
 * @author jinglv
 * @date 2021/04/04
 */
public class ProductDao {
    public void save() {
        System.out.println("保存商品...");
    }

    public void update() {
        System.out.println("修改商品...");
    }

    public void delete() {
        System.out.println("删除商品...");
    }

    public void find() {
        System.out.println("查询商品...");
    }
}
