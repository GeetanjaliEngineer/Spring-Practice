package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	//insert the query in database
	public int insert(Student student) {
		 String query = "INSERT INTO student(id, name, city) VALUES (?, ?, ?)";
		 int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	//Update the database 
	public int change(Student student) {
		//update data 
		String query = "UPDATE student set name =?, city=? where id = ?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(),student.getId());
		return r;
	}
	//delete the operation
	public int delete(int studentId) {
		String query ="delete from student where id =?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	




}
