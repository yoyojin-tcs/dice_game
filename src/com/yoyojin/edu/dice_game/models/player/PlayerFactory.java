package com.yoyojin.edu.dice_game.models.player;

import com.yoyojin.edu.dice_game.idGenerator.IdGenerator;

public class PlayerFactory {
    private final IdGenerator idGenerator;

    public PlayerFactory(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    public Player makePlayer(final String name) {
        return new Player(idGenerator.generateId(), name);
    }
}
