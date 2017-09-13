package com.example.user.snakesandladders;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 13/09/2017.
 */

public class Board {

    private ArrayList<Tile> tiles;
    private int size;

    public Board(int size) {
        this.tiles = new ArrayList<>();
        this.size = size;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void setUp() {
        for (int i = 0; i <= this.size; i++){
            this.tiles.add(new NormalTile(i));
        }
    }

    public void setUpSnakes(int frequency) {
        for (int i = 1; i < this.tiles.size(); i++) {
            Tile tile = this.tiles.get(i);
            if (tile.getNumber() % frequency == 0) {
                this.tiles.set(i, new SnakeTile(i));
            }
        }
    }

    public void setUpLadders(int frequency) {
        for (int i = 1; i < this.tiles.size(); i++) {
            Tile tile = this.tiles.get(i);
            if (tile.getNumber() % frequency == 0) {
                this.tiles.set(i, new LadderTile(i));
            }
        }
    }




}
