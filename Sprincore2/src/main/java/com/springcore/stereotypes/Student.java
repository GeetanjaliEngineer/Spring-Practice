package com.springcore.stereotypes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob") // Bean name = "ob"
@Scope("prototype" )
public class Student {

    @Value("Geetanjali Kohli")
    private String name;

    @Value("101")
    private int id;

    @Value("#{temp}") // Injecting list from stereo.xml
    private List<String> address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
    }
}
