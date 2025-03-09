package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        // Corrected XML file path
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");

        // Retrieve the bean correctly
        Emp emp1 = (Emp) context.getBean("emp1");

        // Display the employee details
        System.out.println(emp1.getName());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getCourses());
    }
}
