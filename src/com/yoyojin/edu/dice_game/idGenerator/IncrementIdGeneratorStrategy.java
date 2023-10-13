package com.yoyojin.edu.dice_game.idGenerator;

import java.util.Objects;

public class IncrementIdGeneratorStrategy implements IdGenerator {
    private Long currentId;

    public IncrementIdGeneratorStrategy() {
    }

    public IncrementIdGeneratorStrategy(Long initId) {
        Objects.requireNonNull(initId);
        this.currentId = initId;
    }

    @Override
    public Long generateId() {
        return currentId++;
    }
}