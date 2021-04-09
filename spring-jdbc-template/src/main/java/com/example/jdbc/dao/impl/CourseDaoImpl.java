package com.example.jdbc.dao.impl;

import com.example.jdbc.dao.CourseDao;
import com.example.jdbc.entity.Course;
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
public class CourseDaoImpl implements CourseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Course course) {
        String sql = "insert into course(name, score) values(?,?)";
        jdbcTemplate.update(sql, course.getName(), course.getScore());
    }

    @Override
    public void update(Course course) {
        String sql = "update course set name=?, score=? where id=?";
        jdbcTemplate.update(sql, course.getName(), course.getScore(), course.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from course where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Course select(int id) {
        String sql = "select * from course where id=?";
        return jdbcTemplate.queryForObject(sql, new CourseRowMap(), id);
    }

    @Override
    public List<Course> selectAll() {
        String sql = "select * from course";
        return jdbcTemplate.query(sql, new CourseRowMap());
    }

    private class CourseRowMap implements RowMapper<Course> {
        @Override
        public Course mapRow(ResultSet resultSet, int i) throws SQLException {
            // 对象与数据库进行映射
            Course course = new Course();
            course.setId(resultSet.getInt("id"));
            course.setName(resultSet.getString("name"));
            course.setScore(resultSet.getInt("score"));
            return course;
        }
    }
}
