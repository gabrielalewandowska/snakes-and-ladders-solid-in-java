package com.example.user.snakesandladders;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class NormalTileTest {
    private Player player;
    private NormalTile tile;

    @Before
    public void before(){
        player = new Player("Steve");
        tile = new NormalTile(5);
    }

    @Test
    public void canGetTileNumber(){
        assertEquals(5, tile.getNumber());
    }

    @Test
    public void canGetPlayers(){
        assertEquals(0, tile.getPlayers().size());
    }

    @Test
    public void canAddPlayers(){
        tile.addPlayers(player);
        assertEquals(player, tile.getPlayers().get(0));
    }

    @Test
    public void tileCanUpdatePlayerPosition(){
        tile.addPlayers(player);
        tile.updatePlayerPosition();
        assertEquals(5, player.getCurrentPosition());
    }
}
