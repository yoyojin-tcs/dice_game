package com.yoyojin.edu.dice_game.idGenerator;

public class IncrementIdGeneratorStrategy implements IdGenerator {
    private static IncrementIdGeneratorStrategy INSTANCE;
    private Long currentId;


    private IncrementIdGeneratorStrategy(Long currentId) {
        this.currentId = currentId;
    }

    public static IncrementIdGeneratorStrategy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IncrementIdGeneratorStrategy(0L);
        }
        return INSTANCE;
    }

    @Override
    public Long generateId() {
        return currentId++;
    }
}