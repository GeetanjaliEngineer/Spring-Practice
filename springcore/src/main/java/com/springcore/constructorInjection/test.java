package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/consConfig.xml");
        
        Person p = (Person) context.getBean("person"); 
        
        System.out.println(p);
        
   Addition add=(Addition) context.getBean("add");
   add.doSum();
   System.out.println(add);
    }
}
