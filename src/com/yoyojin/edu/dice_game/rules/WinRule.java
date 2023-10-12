package com.yoyojin.edu.dice_game.rules;

import com.yoyojin.edu.dice_game.exceptions.MoreThanOneWinnerException;
import com.yoyojin.edu.dice_game.models.player.Player;

import java.util.List;

public interface WinRule {
    Player getWinner(List<Player> players) throws MoreThanOneWinnerException;

}
