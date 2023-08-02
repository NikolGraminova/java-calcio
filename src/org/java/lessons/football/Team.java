package org.java.lessons.football;

import java.util.ArrayList;

public class Team {

    // FIELDS
    private Manager manager;
    private ArrayList<Player> players;


    // CONSTRUCTOR
    public Team(Manager manager, ArrayList<Player> players) {
        this.manager = manager;
        this.players = players;
    }

}
