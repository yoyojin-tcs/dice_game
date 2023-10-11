package com.yoyojin.edu.dice_game.models;

import java.util.Random;

public class Dice {
    private static final int MIN_VALUE = 1;
    public final Random RANDOM = new Random();
    private final int maxValue;
    private final int diceNumber;

    public Dice(int diceNumber, int maxValue){
        this.diceNumber = diceNumber;
        if (diceNumber <= 0){
            throw new IllegalArgumentException("Dice number is wrong!");
        }
        if (maxValue < MIN_VALUE){
            throw new IllegalArgumentException("Max value must be larger than minValue");
        }
        this.maxValue = maxValue;
    }

    public int roll(){
        System.out.println("Rolling the dice #" + diceNumber);
        return RANDOM.nextInt(maxValue) + MIN_VALUE;
    }
}
