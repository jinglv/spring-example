package com.spring.example.aop.aspectJ.xml;

/**
 * @author jinglv
 * @date 2020/10/06
 */
public interface CustomerDAO {

    void save();

    String update();

    void delete();

    void findOne();

    void findAll();
}
