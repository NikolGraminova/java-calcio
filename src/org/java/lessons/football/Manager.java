package org.java.lessons.football;

public class Manager extends Person{

    // FIELDS
    private String tactic;


    // CONSTRUCTORS
    public Manager(String name, int age, String tactic) {
        super(name, age);
        this.tactic = tactic;
    }


    // METHODS


    @Override
    public String toString() {
        return super.toString() +
                " , '" + tactic + '\'' +
                '}';
    }
}
