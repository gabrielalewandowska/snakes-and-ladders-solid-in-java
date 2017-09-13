package com.example.user.snakesandladders;

import android.service.quicksettings.*;

import java.util.ArrayList;

/**
 * Created by user on 13/09/2017.
 */

public abstract class Tile implements CanUpdatePlayerPosition {
     int number;
     ArrayList<Player> players;

    public Tile(int number) {
        this.number = number;
        this.players = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }


    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayers(Player player){
        this.players.add(player);
    }
}
