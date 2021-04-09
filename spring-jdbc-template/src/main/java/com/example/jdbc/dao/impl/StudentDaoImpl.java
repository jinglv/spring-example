package com.example.jdbc.dao.impl;

import com.example.jdbc.dao.StudentDao;
import com.example.jdbc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author jinglv
 * @date 2021/04/08
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Student stu) {
        String sql = "insert into student(name, sex, born) values(?, ?, ?)";
        jdbcTemplate.update(sql, stu.getName(), stu.getSex(), stu.getBorn());
    }

    @Override
    public void update(Student stu) {
        String sql = "update student set name=?, sex=?, born=? where id=?";
        jdbcTemplate.update(sql, stu.getName(), stu.getSex(), stu.getBorn());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from student where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Student select(int id) {
        String sql = "select * from student where id=?";
        return jdbcTemplate.queryForObject(sql, new StudentRowMap(), id);
    }

    @Override
    public List<Student> selectAll() {
        String sql = "select * from student";
        return jdbcTemplate.query(sql, new StudentRowMap());
    }

    private class StudentRowMap implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            // 对象与数据库进行映射
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setSex(resultSet.getString("sex"));
            student.setBorn(resultSet.getDate("born"));
            return student;
        }
    }
}
