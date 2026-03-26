package de.lubowiecki.aufgaben.a2;

import java.util.Random;

public class DiceCup {

    private static Random rand = new Random();

    public static int roll() {
        return rand.nextInt(1, 7);
    }

    public static int[] roll(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = roll();
        }
        return arr;
    }
}
