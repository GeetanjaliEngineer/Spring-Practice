package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // Marks Emp as a Spring-managed bean
public class Emp {
    private Address address;

    @Autowired  // Automatically injects Address bean
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee Address: " + address;
    }
}
