package com.example.user.snakesandladders;

/**
 * Created by user on 13/09/2017.
 */

class Player {

    private String name;
    private int currentPosition;

    public Player(String name){
        this.name = name;
        this.currentPosition = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
