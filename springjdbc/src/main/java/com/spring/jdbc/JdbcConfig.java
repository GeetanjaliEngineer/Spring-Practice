package com.spring.jdbc;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;


@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JdbcConfig {
	@Bean(name={"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false&serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("tiger");
		return ds;
		}

	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate()
	{
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
	}
	
	@Bean
	public StudentDao studentDao() {
	    StudentDaoImpl dao = new StudentDaoImpl();
	    dao.setJdbcTemplate(getTemplate());
	    return dao;
	}

{
	
}
	
}
