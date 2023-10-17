package com.yoyojin.edu.dice_game.models.player;

import com.yoyojin.edu.dice_game.idGenerator.IdGenerator;

import java.util.Objects;

public class PlayerFactory {
    private final IdGenerator idGenerator;

    public PlayerFactory(IdGenerator idGenerator) {
        Objects.requireNonNull(idGenerator);
        this.idGenerator = idGenerator;
    }

    public Player createPlayer(final String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Bad name argument");
        }
        return new Player(idGenerator.generateId(), name);
    }
}
