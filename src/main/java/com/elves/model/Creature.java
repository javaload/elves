package com.elves.model;

public abstract class Creature {
    private String race;
    private int health;
    private int strengths;
    private int agility;
    private int intellect;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrengths() {
        return strengths;
    }

    public void setStrengths(int strengths) {
        this.strengths = strengths;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }
}
