package com.springcore.constructorInjection;

public class Person {
    private String name;
    private int age;
    private Certi certi;

    // Constructor
    public Person(String name, int age, Certi certi) {
        this.name = name;
        this.age = age;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", certi=" + certi.getName() + "}";
    }
}
