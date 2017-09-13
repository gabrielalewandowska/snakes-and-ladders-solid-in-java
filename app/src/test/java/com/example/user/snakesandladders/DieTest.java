package com.example.user.snakesandladders;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class DieTest {
    Die die;

    @Before
    public void before(){
        die = new Die();
    }

    @Test
    public void canGetResult(){
        assertEquals(0, die.getResult());
    }

    @Test
    public void dieRollsRandomNumberBetween1And6(){
       boolean condition = false;
        if (die.roll() >= 1 && die.roll() <= 6){
            condition = true;
        }
        assertEquals(true, condition);
    }

    @Test
    public void dieResultGetsUpdatedAfterRoll(){
        int result = die.roll();
        assertEquals(result, die.getResult());
    }
}
