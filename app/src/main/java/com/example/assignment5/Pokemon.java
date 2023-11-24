package com.example.assignment5;

import java.util.List;

public class Pokemon {

    private String name;
    private int id;
    /*private int weight;
    private int height;
    private int baseExperience;
    private String move;
    private String ability;*/

    public Pokemon(String name, int id) {
        this.name = name;
        this.id = id;
        /*this.weight = weight;
        this.height = height;
        this.baseExperience = baseExperience;
        this.move = moves[0];
        this.ability = abilities[0];*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }*/
}
