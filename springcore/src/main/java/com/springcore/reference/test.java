package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/refConfig.xml");

        // Get the 'A' bean from Spring container
        A temp = (A) context.getBean("aref");

        // Display values
        System.out.println("Value of X: " + temp.getX());
        System.out.println("Value of Y: " + temp.getOb().getY());
    System.out.println(temp);
    }
}
