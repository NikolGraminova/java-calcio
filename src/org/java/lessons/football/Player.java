package org.java.lessons.football;

public class Player extends Person{

    // FIELDS
    private String position;


    // CONSTRUCTORS
    public Player(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }


    // METHODS
    @Override
    public String toString() {
        return super.toString() +
                " , '" + position + '\'' +
                '}';
    }
}
