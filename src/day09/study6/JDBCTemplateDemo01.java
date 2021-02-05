package day09.study6;

import day09.study5.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateDemo01 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update school.account set balance = 5000 where id= ? ";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
