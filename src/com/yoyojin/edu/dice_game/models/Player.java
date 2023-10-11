package com.yoyojin.edu.dice_game.models;

public class Player {
    private final String name;
    private int score = 0;

    public Player(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name can't be empty or null!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
