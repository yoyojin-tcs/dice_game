package com.yoyojin.edu.dice_game.models.player;

public class Player {
    private final Long id;
    private final String name;
    private int score = 0;

    protected Player(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
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