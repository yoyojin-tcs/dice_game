package com.yoyojin.edu.dice_game.rules;

import com.yoyojin.edu.dice_game.exceptions.MoreThanOneWinnerException;
import com.yoyojin.edu.dice_game.models.Player;

import java.util.Comparator;
import java.util.List;

public class DiceTotalValueWinStrategy implements WinRule {
    @Override
    public Player getWinner(List<Player> players) throws MoreThanOneWinnerException {
        int winScore = players.stream().max(Comparator.comparingInt(Player::getScore)).get().getScore();
        List<Player> winners = players.stream().filter(player -> player.getScore() == winScore).toList();
        if (winners.size() > 1) throw new MoreThanOneWinnerException();
        return winners.get(0);
    }
}
