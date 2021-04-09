package com.example.jdbc;

import com.example.jdbc.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author jinglv
 * @date 2021/04/08
 */
public class TestJdbc {

    private final JdbcTemplate jdbcTemplate;

    {
        // 获取上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }

    @Test
    void testExecute() {
        // 新增数据表
        jdbcTemplate.execute("create table users(id int,name varchar(20))");
    }

    /**
     * 插入数据
     */
    @Test
    void testInsert() {
        String sql = "insert into student(name, sex) values(?,?)";
        jdbcTemplate.update(sql, new Object[]{"芈月", "女"});
    }

    /**
     * 更新数据
     */
    @Test
    void testUpdate() {
        String sql = "update student set sex=? where id=?";
        jdbcTemplate.update(sql, new Object[]{"非男", 1});
    }

    /**
     * 批量新增数据
     */
    @Test
    void testBatchInsert() {
        // SQL语句，数组
        String[] sqls = {
                "insert into student(name, sex) values('王昭君','女')",
                "insert into student(name, sex) values('张飞','男')",
                "insert into student(name, sex) values('孙膑','男')",
        };
        jdbcTemplate.batchUpdate(sqls);
    }

    @Test
    void testBatchInsert2() {
        String sql = "insert into selection(student, course, score) values (?, ?, ?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{2, 1001, 1001});
        list.add(new Object[]{2, 1003, 1003});
        jdbcTemplate.batchUpdate(sql, list);
    }

    /**
     * 数据查询
     */
    @Test
    void testQuerySimple1() {
        String sql = "select count(*) from student";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }

    @Test
    void testQuerySimple2() {
        String sql = "select name from student where sex=?";
        List<String> names = jdbcTemplate.queryForList(sql, String.class, "女");
        names.forEach(System.out::println);
    }

    @Test
    void testQueryMap1() {
        String sql = "select * from student where id=?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql, 1);
        stringObjectMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    @Test
    void testQueryMap2() {
        String sql = "select * from student";
        List<Map<String, Object>> students = jdbcTemplate.queryForList(sql);
        students.forEach(System.out::println);
    }

    @Test
    void testQueryEntity() {
        String sql = "select * from student where id=?";
        Student student = jdbcTemplate.queryForObject(sql, new StudentRowMap(), 1);
        System.out.println(student);
    }

    @Test
    void testQuery() {
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new StudentRowMap());
        System.out.println(students);
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
