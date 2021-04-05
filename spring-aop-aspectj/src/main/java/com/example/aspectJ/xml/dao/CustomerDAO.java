package com.example.aspectJ.xml.dao;

/**
 * Customer DAO接口层，目标类
 *
 * @author jinglv
 * @date 2020/10/06
 */
public interface CustomerDAO {

    /**
     * 客户保存
     */
    void save();

    /**
     * 客户更新
     *
     * @return String
     */
    String update();

    /**
     * 客户删除
     */
    void delete();

    /**
     * 客户单个查询
     */
    void findOne();

    /**
     * 客户所有查询
     */
    void findAll();
}
