package com.springcore.lifecyclemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AbstractApplicationContext context= new  ClassPathXmlApplicationContext("com/springcore/lifecyclemethod/config.xml");
	Samosa s1 = (Samosa) context.getBean("s1");
	System.out.println(s1);
	//after calling abstract application context
	context.registerShutdownHook();
	
	}

}
