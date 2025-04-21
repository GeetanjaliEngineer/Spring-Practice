package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

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
					// taking input from user
					System.out.println("Enter user Id: ");
					int uid = Integer.parseInt(br.readLine());

					System.out.println("Enter User Name: ");
					String uName = br.readLine();

					System.out.println("Enter user city: ");
					String uCity = br.readLine();
					// creating student object
					Student s = new Student();
					s.setStudentId(uid);
					s.setStudentName(uName);
					s.setStudentCity(uCity);
					// saving studetn object to database by calling insert of studentDao
					int r = studentDao.insert(s);
					System.out.println(r + " Student added");
					System.out.println("____________________________________");
					break;

				case 2:
					// display all student

					List<Student> allStudents = studentDao.getAllStudents();
					for (Student st : allStudents) {
						System.out.println("Name: " + st.getStudentName());
						System.out.println("Id: " + st.getStudentId());
						System.out.println("City" + st.getStudentCity());
						System.out.println("________________________________");
					}
					break;
				case 3:
					// get a single student data
					System.out.println("Enter User id: ");
					int userId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(userId);
					System.out.println("Id :" + student.getStudentId());
					System.out.println("Name : " + student.getStudentName());
					System.out.println("City :" + student.getStudentCity());

					break;
				case 4:
					// delete single student
					System.out.println("Enter user id :");
					int id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("Student deleted successfully..");
					System.out.println("___________________________________________");

					break;
				case 5:
					// update the student
					System.out.println("Enter Student id to update:");
					int uid1 = Integer.parseInt(br.readLine());
					Student student2 = studentDao.getStudent(uid1);
					if (student2 != null) {
						System.out.println("Current Name: " + student2.getStudentName());
						System.out.println("Enter New Name:");
						String newName = br.readLine();

						System.out.println("Current City: " + student2.getStudentCity());
						System.out.println("Enter New City: ");
						String newCity = br.readLine();

						student2.setStudentName(newName);
						student2.setStudentCity(newCity);

						studentDao.updateStudent(student2);
						System.out.println("Student Updated successfully.");
					} else {
						System.out.println("Student with ID" + uid1 + "does not exist.");

					}
					System.out.println("________________________________________");

					break;
				case 6:
					// exit

					go = false;
					System.out.println("Exiting the application...");
					System.out.println("GoodBye!");

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
