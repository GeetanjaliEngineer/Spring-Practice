package com.springcore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotations/config2.xml");

        Emp emp = context.getBean(Emp.class);
        System.out.println(emp);
    }
}
