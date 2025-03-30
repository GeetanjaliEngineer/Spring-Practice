package com.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // Fix: Correct XML path
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practice/config2.xml");

        // Fix: Ensure correct Bean retrieval
        Client client = context.getBean("client", Client.class);  
        client.doWork();

        System.out.println("prac");
    }
}
