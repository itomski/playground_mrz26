package de.lubowiecki.aufgaben.a2;

import java.util.Random;

public class DiceCup {

    private static Random rand = new Random();

    public static int roll() {
        return rand.nextInt(1, 7);
    }
}
