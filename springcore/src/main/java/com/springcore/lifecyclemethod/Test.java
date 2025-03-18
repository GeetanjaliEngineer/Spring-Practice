package com.springcore.lifecyclemethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecyclemethod/config.xml");

		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);

		context.registerShutdownHook();
		// If you don't use registerShutdownHook(),
		// you can manually close the context.close();
		context.close(); // Ensures destroy method is called

	}
}
