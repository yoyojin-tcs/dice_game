package com.yoyojin.edu.dice_game;

import com.yoyojin.edu.dice_game.exceptions.MoreThanOneWinnerException;
import com.yoyojin.edu.dice_game.models.Dice;
import com.yoyojin.edu.dice_game.models.Player;
import com.yoyojin.edu.dice_game.rules.WinRule;

import java.util.List;

public class Game {

    private final List<Player> players;
    private final List<Dice> dices;

    private final WinRule rule;

    public Game(List<Player> players, List<Dice> dices, WinRule rule) {
        //validations
        this.players = players;
        this.dices = dices;
        this.rule = rule;
    }

    public Player play() {
        Player winner = null;
        boolean hasWinner = false;
        while (!hasWinner) {
            for (Player player : players) {
                int playerScore = 0;
                for (Dice dice : dices) {
                    playerScore += dice.roll();
                }
                player.setScore(playerScore);
            }
            try {
                winner = rule.getWinner(players);
                hasWinner = true;
            } catch (MoreThanOneWinnerException e) {
                System.out.println("More than one winner exception.");
            }
        }
        return winner;
    }
}
