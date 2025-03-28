package com.springcore.auto.wire;

import com.springcore.auto.wire.annotations.Address;

public class Emp {
    private Address address; // This field must match `byType` autowiring

    public void setAddress(Address address) { 
    	// Required for `byType`
        System.out.println("Setting address..");
    	this.address = address;
    }

    @Override
    public String toString() {
        return "Employee Address: " + address;
    }

	public Emp(Address address) {
		super();
		this.address =address;
		System.out.println("inside constructor..");
		// TODO Auto-generated constructor stub
	}
}
