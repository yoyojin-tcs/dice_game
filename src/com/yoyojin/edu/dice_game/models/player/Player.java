package com.yoyojin.edu.dice_game.models.player;

public class Player {
    private final Long id;
    private final String name;
    private int score = 0;

    protected Player(Long id, String name) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("Id must be not null and non-negative!");
        }
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name can't be empty or null!");
        }
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