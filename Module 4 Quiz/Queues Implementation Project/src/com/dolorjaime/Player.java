package com.dolorjaime;

import java.util.Objects;

public class Player {
    private int id;
    private String name;
    private int level;

    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return name;
    }
}
