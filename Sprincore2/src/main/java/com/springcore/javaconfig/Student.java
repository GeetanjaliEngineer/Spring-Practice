package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
		// TODO Auto-generated constructor stub
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println(" student is reading book ..");

	}

}
