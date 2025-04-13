package com.spring.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("The Database started..!");

		// Load Spring config
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");

		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);
//		Student student = new Student();
//		student.setId(765);
//		student.setName("kirti");
//		student.setCity("kanpur");
//
//		int result = studentDao.insert(student);
//
//		System.out.println("student added= " + result);
		
		//Update 
//		Student student= new Student();
//		student.setId(245);
//		student.setName("Raj Kamar");
//		student.setCity("Lucknow");
//		studentDao.change(student);
//		
//		int result = studentDao.change(student);
//		System.out.println("Data changed" +result);
		
		//delete 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Id you want to delete:");
		int id = sc.nextInt();
		int result = studentDao.delete(id);
		System.out.println("query deleted successfully : "+result);
		
	}
}