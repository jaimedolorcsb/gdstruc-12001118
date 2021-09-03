package com.dolorjaime;

public class Player {

    Player(String name, int id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    private int id;
    private int  level;
    private String name;

    public int getId() {return id;}
    public int getLevel() {return level;}
    public String getName() {return name;}

}
