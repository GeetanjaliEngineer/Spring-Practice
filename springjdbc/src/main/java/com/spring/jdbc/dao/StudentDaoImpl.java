package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// insert the query in database
	public int insert(Student student) {
		String query = "INSERT INTO student(id, name, city) VALUES (?, ?, ?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	// Update the database
	public int change(Student student) {
		// update data
		String query = "UPDATE student set name =?, city=? where id = ?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	// delete the operation
	public int delete(int studentId) {
		String query = "delete from student where id =?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	// selecting single student data
	public Student getStudent(int studentId) {
		String query = "select * from student where id= ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	//selecting multiple student 
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students= this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
