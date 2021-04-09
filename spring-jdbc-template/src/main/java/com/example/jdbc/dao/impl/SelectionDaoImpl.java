package com.example.jdbc.dao.impl;

import com.example.jdbc.dao.SelectionDao;
import com.example.jdbc.entity.Selection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jinglv
 * @date 2021/04/08
 */
@Repository
public class SelectionDaoImpl implements SelectionDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(List<Selection> selections) {
        String sql = "insert into selection values(?,?,?,?)";
        List<Object[]> list = new ArrayList<>();
        for (Selection selection : selections) {
            Object[] args = new Object[4];
            args[0] = selection.getSid();
            args[1] = selection.getCid();
            args[2] = selection.getSelTime();
            args[3] = selection.getScore();
            list.add(args);
        }
        jdbcTemplate.batchUpdate(sql, list);
    }

    @Override
    public void delete(int sid, int cid) {
        String sql = "delete from selection where student=? and course=?";
        jdbcTemplate.update(sql, sid, cid);
    }

    @Override
    public List<Map<String, Object>> selectByStudent(int sid) {
        String sql = "select se.*, stu.name sname, cou.name cname from selection se " +
                "left join student stu on se.student=stu.id " +
                "left join course cou on se.course=cou.id " +
                "where student=?";
        return jdbcTemplate.queryForList(sql, sid);
    }

    @Override
    public List<Map<String, Object>> selectByCourse(int cid) {
        String sql = "select se.*, stu.name sname, cou.name cname from selection se " +
                "left join student stu on se.student=stu.id " +
                "left join course cou on se.course=cou.id " +
                "where course=?";
        return jdbcTemplate.queryForList(sql, cid);
    }
}
