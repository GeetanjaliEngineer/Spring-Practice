package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        System.out.println("The Database started..!");

        // Load Spring config
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");

        // Get JdbcTemplate bean
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        // Insert query
        String query = "INSERT INTO student(id, name, city) VALUES (?, ?, ?)";

        // Fire query
        int result = template.update(query, 456, "Uttam Kumar", "Kanpur");
        System.out.println("Number of records inserted: " + result);
    }
}