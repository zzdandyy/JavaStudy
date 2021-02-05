package day09.study6;

import day09.study5.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo02 {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test1() {
        //修改5号学生的成绩为99
        template.update("update school.students set score=? where id=?", 99, 5);
    }

    @Test
    public void test2() {
        //添加一条记录
        template.update("insert into school.students values(null,?,?,?,?)", 2, "小兵", "B", 88);
    }

    @Test
    public void tesT3() {
        //删除刚刚添加的记录
        template.update("delete from school.students where name=?", "小兵");
    }

    @Test
    public void test4() {
        //查询id为1的记录，封装为Map集合
        //查询的结果集长度只能是1
        Map<String, Object> map = template.queryForMap("select * from school.students where id=?", 1);
        System.out.println(map);
    }

    @Test
    public void test5() {
        //查询所有记录，封装为List集合
        List<Map<String, Object>> list = template.queryForList("select * from school.students");
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    @Test
    public void test6() {
        //查询所有记录，封装为Students对象的List集合
        // BeanPropertyRowMapper 自动封装，要求类要有默认构造函数
        List<Student> list = template.query("select * from school.students", new BeanPropertyRowMapper<>(Student.class));
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void tesT7() {
        //查询总记录数
        Long total = template.queryForObject("select count(id) from school.students", long.class);
        System.out.println(total);
    }
}
