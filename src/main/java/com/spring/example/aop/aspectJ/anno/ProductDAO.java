package com.spring.example.aop.aspectJ.anno;

/**
 * @author jinglv
 * @date 2020/10/06
 */
public class ProductDAO {

    public void save() {
        System.out.println("保存商品！！！");
    }

    public String update() {
        System.out.println("修改商品！！！");
        return "娃哈哈";
    }

    public void delete() {
        System.out.println("删除商品！！！");
    }

    public void findOne() {
        System.out.println("查询一个商品！！！");
        // int i = 1 / 0;
    }

    public void findAll() {
        System.out.println("查询所有商品！！！");
        // int i = 1 / 0;
    }
}
