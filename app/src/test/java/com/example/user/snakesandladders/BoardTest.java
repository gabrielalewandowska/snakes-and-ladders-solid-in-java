package com.example.user.snakesandladders;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class BoardTest {
    Board board;
    NormalTile normalTile;
    SnakeTile snakeTile;
    LadderTile ladderTile;

    @Before
    public void before(){
        board = new Board(50);
        normalTile = new NormalTile(0);
        snakeTile = new SnakeTile(16);
        ladderTile = new LadderTile(14);
    }

    @Test
    public void tileArrayStartsEmpty(){
        assertEquals(0, board.getTiles().size());
    }

    @Test
    public void canSetUpBpard(){
        board.setUp();
        assertEquals(51, board.getTiles().size());
    }

    @Test
    public void canSetUpSnakes(){
        board.setUp();

        board.setUpSnakes(16);

        assertEquals(normalTile.getClass(),board.getTiles().get(0).getClass());
        assertEquals(snakeTile.getClass(),board.getTiles().get(16).getClass());
        assertEquals(snakeTile.getClass(),board.getTiles().get(32).getClass());
        assertEquals(snakeTile.getClass(),board.getTiles().get(48).getClass());
    }

    @Test
    public void canSetUpLadders(){
        board.setUp();
        board.setUpSnakes(16);
        board.setUpLadders(14);

        assertEquals(ladderTile.getClass(), board.getTiles().get(14).getClass());
        assertEquals(ladderTile.getClass(), board.getTiles().get(28).getClass());
        assertEquals(ladderTile.getClass(), board.getTiles().get(42).getClass());
    }
}
