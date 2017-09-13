package com.example.user.snakesandladders;

import java.util.ArrayList;

/**
 * Created by user on 13/09/2017.
 */

public class Game {
    Board board;
    ArrayList<Player> players;
    Die die;

    public Game(Board board, ArrayList<Player> players, Die die) {
        this.board = board;
        this.players = players;
        this.die = die;
    }

    public Board getBoard() {
        return board;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Die getDie() {
        return die;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    
}
