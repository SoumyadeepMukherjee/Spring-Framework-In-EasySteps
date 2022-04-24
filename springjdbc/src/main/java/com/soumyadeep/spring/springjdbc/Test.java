package com.soumyadeep.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/soumyadeep/spring/springjdbc/config.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        String sql = "insert into employee values(?,?,?)";
        int result = jdbcTemplate.update(sql, new Integer(1), "Soumyadeep", "Mukherjee");
        System.out.println("Number of records inserted:" + result);
    }
}