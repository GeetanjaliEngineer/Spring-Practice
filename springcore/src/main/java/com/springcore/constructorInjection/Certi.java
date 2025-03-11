package com.springcore.constructorInjection;

public class Certi {
    private String name;

    // Constructor
    public Certi(String name) {
        this.name = name;
    }

    // Getter method (fixing the error)
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Certi{name='" + name + "'}";
    }
}
