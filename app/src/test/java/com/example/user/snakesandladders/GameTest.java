package com.example.user.snakesandladders;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 13/09/2017.
 */

public class GameTest {
    Board board;
    Player steve;
    Player fred;
    ArrayList<Player> players;
    Die die;
    Game game;

    @Before
    public void before(){
        board = new Board(50);
        die = new Die();
        steve = new Player("Steve");
        fred = new Player("Fred");
        players = new ArrayList<>();
        game = new Game(board, players, die);
    }

    @Test
    public void canAddPlayers(){
        game.addPlayer(steve);
        assertEquals(steve, game.players.get(0));
    }

    @Test
    public void canGetBoard(){
        assertEquals(board, game.getBoard());
    }

    @Test
    public void canGetDie(){
        assertEquals(die, game.getDie());
    }
}
