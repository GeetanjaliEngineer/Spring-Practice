package com.spring.jdbc;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("The Database started..!");

        // ✅ Load Java-based Spring config
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // Insert a student
        Student student = new Student();
        student.setId(78);
        student.setName("Siya");
        student.setCity("Delhi");

        int result = studentDao.insert(student);
        System.out.println("Student added = " + result);
		
		// Update the query
//		Student student= new Student();
//		student.setId(245);
//		student.setName("Raj Kamar");
//		student.setCity("Lucknow");
//		studentDao.change(student);
//		
//		int result = studentDao.change(student);
//		System.out.println("Data changed" +result);

		// delete the query 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Student Id you want to delete:");
//		int id = sc.nextInt();
//		int result = studentDao.delete(id);
//		System.out.println("query deleted successfully : "+result);
//		

//		//Select single data 
//	Student student = studentDao.getStudent(456);
//	System.out.println(student);
        // Get all students
        List<Student> students = studentDao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}