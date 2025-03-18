package com.springcore.lifecyclemethod;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
//	init()
	public void hey() {
		System.out.println("Inside init method : hey how are you");
	}
//	destory()
	public void bye() {
		System.out.println("Inside destory method bye ");
	}
	
}
