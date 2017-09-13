package com.example.user.snakesandladders;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class SnakeTileTest {
    private Player player;
    private SnakeTile tile;

    @Before
    public void before(){
        player = new Player("Steve");
        tile = new SnakeTile(40);
    }

    @Test
    public void tileCanUpdatePlayerPosition(){
        tile.addPlayers(player);
        tile.updatePlayerPosition();
        assertEquals(35, player.getCurrentPosition());
    }
}
