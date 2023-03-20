package ru.mirea.task30;

import java.io.Serializable;

public class MenuItem implements Serializable {
    private int cost;
    private String name;
    private String description;

    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name +" " + cost +" " + "руб. "+ description;
    }
}