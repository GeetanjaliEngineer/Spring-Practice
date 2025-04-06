package com.springcore.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotypes/stereo.xml");

        Student student = con.getBean("ob", Student.class);
        System.out.println(student);
        System.out.println("Student Address List Class: " + student.getAddress().getClass().getName());

        Student student2 = con.getBean("ob", Student.class);
        System.out.println("Student1 hashCode: " + student.hashCode());
        System.out.println("Student2 hashCode: " + student2.hashCode());

        Teacher t1 = con.getBean("teacher", Teacher.class);
        Teacher t2 = con.getBean("teacher", Teacher.class);
        System.out.println("Teacher1 hashCode: " + t1.hashCode());
        System.out.println("Teacher2 hashCode: " + t2.hashCode());
    }
}
