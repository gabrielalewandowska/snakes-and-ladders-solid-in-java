package com.example.user.snakesandladders;

import java.util.ArrayList;

/**
 * Created by user on 13/09/2017.
 */

public class SnakeTile extends Tile {

    public SnakeTile(int number) {
        super(number);
        this.players = new ArrayList<>();
    }


    @Override
    public void updatePlayerPosition() {
        for (Player player : players) {
            player.setCurrentPosition(this.number - 5);
        }
    }
}
