package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {

        int[] zahlen = {10, -7, 22, 15, 100, 1, 99};

        System.out.println(zahlen);
        System.out.println(Arrays.toString(zahlen));
        Arrays.sort(zahlen);
        System.out.println(Arrays.toString(zahlen));

        System.out.println();
        // Index ist immer vom typ int
        int erg = Arrays.binarySearch(zahlen, 15);
        System.out.println(erg);

        // Binärsuche setzt Sortierung voraus
        erg = Arrays.binarySearch(zahlen, -6);
        System.out.println(erg);

        System.out.println();

        int[][] sammlung = {{1,2,3},{4,5,6,7},{8,9}};
        System.out.println(Arrays.deepToString(sammlung));

        System.out.println();

        zahlen = Arrays.copyOf(zahlen, 20); // Alte Werte werden übernommen
        // zahlen = new int[20]; // Alte Werte werden NICHT übernommen
        System.out.println(Arrays.toString(zahlen));

    }
}
