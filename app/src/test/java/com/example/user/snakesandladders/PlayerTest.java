package com.example.user.snakesandladders;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class PlayerTest {
    Player player;

    @Before
    public void before(){
        player = new Player("Steve");
    }

    @Test
    public void canGetName(){
        assertEquals("Steve", player.getName());
    }

    @Test
    public void canGetCurrentPosition(){
        assertEquals(0, player.getCurrentPosition());
    }
}
