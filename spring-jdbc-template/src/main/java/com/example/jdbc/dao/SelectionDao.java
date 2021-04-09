package com.example.jdbc.dao;

import com.example.jdbc.entity.Selection;

import java.util.List;
import java.util.Map;

/**
 * @author jinglv
 * @date 2021/04/08
 */
public interface SelectionDao {
    /**
     * 插入多条数据
     *
     * @param selections 数据
     */
    void insert(List<Selection> selections);

    /**
     * 根据id删除数据
     *
     * @param sid 学生id
     * @param cid 课程id
     */
    void delete(int sid, int cid);

    /**
     * 根据学生id查询
     *
     * @param sid 学生id
     * @return list
     */
    List<Map<String, Object>> selectByStudent(int sid);

    /**
     * 根据课程id查询
     *
     * @param cid 课程id
     * @return list
     */
    List<Map<String, Object>> selectByCourse(int cid);
}
