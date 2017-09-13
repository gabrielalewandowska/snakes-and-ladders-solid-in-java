package com.example.user.snakesandladders;

import java.util.Random;

/**
 * Created by user on 13/09/2017.
 */

class Die {

    private int result;


    public Die(){
        this.result = 0;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int roll(){
        Random rand = new Random();
        int result = rand.nextInt((6 - 1) + 1) + 1;
        this.result = result;
        return result;
    }



}
