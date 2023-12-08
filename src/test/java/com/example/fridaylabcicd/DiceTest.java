package com.example.fridaylabcicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {
    @Test
    public void rollTest()
    {
        Dice dice = new Dice(1, "Red");
        int newResult = dice.roll();
        assertTrue(newResult >= 1 && newResult <= 6);
    }

    @Test
    public void testSide()
    {
        Dice diceFive = new Dice(5, "White");
        assertEquals(5, diceFive.getSides());
    }

    @Test
    public void getColorTest()
    {
        Dice diceThree = new Dice(3, "Green");
        assertEquals("Green", diceThree.getColor());
    }

    @Test
    public void testToString()
    {
        Dice diceOne = new Dice(12, "Yellow");
        assertEquals("A 12 sided die", diceOne.toString());
    }
}
