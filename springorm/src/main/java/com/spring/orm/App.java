package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);
//        Student student = new Student(45, "geet", "lucknow");
//        int r = studentDao.insert(student);
//        System.out.println("Inserted with ID: " + r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;

		while (go) {

			System.out.println("PRESS 1 for add new Student");
			System.out.println("PRESS 2 for display all students");
			System.out.println("PRESS 3 for get detail of single student");
			System.out.println("PRESS 4 for delete students");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for EXIT");

			try {
				int input = Integer.parseInt(br.readLine());
//        	if(input==1)
//        	{
//        		// add a new student 
//        	}else if (input == 2 ) {
//				// display
//			}

				switch (input) {
				case 1:
					// add a new student

					break;
				case 2:
					// display all student
					break;
				case 3:
					// get a single student data
					break;
				case 4:
					// delete single student
					break;
				case 5:
					// update the student
					break;
				case 6:
					// exit
					go = false;

					break;

				}
			} catch (Exception e) {
				System.out.println("INVALID INPUT.. TRY WITH OTHER ONE");
				System.out.println(e.getMessage());
			}
			System.out.println("ThankYou for using my Application");
			System.out.println("See You Soon!");
		}
	}
}
