package com.yoyojin.edu.dice_game.idGenerator;

public class IncrementIdGeneratorStrategy implements IdGenerator {
    private Long currentId;

    public IncrementIdGeneratorStrategy() {
    }

    public IncrementIdGeneratorStrategy(Long initId) {
        this.currentId = initId;
    }

    @Override
    public Long generateId() {
        return currentId++;
    }
}