package com.springcore.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	System.out.println("hellow spring");
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the bean from the Spring container
         Student student1=(Student) context.getBean("student1");
          Student student2=(Student)context.getBean("student2");
        // Use the bean
         System.out.println(student1);
         System.out.println("________________________________________");
         System.out.println(student2);
         }
}