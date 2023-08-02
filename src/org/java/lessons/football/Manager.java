package org.java.lessons.football;

public class Manager extends Person{

    // FIELDS
    private String strategy;


    // CONSTRUCTORS
    public Manager(String name, int age, String strategy) {
        super(name, age);
        this.strategy = strategy;
    }

}
