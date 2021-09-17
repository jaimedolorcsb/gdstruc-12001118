package com.dolorjaime;

import java.util.Objects;

public class Player {
    private int id;
    private int level;
    private String name;

    public Player(int id, int level, String name) {
        this.id = id;
        this.level = level;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return id == player.id &&
                level == player.level &&
                Objects.equals(name, player.name);
    }

    @Override
    public String toString() {
        return "Player { Name = " + name +
                ", Level = " + level +
                ", ID = " + id +
                " }";
    }
}
