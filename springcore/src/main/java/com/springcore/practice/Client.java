package com.springcore.practice;

public class Client {
    private ServiceA serviceA;

    // Constructor Injection
    public Client(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void doWork() {
        serviceA.serve();
    }
}
