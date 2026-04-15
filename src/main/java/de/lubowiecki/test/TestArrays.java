package de.lubowiecki.test;

import java.util.Arrays;

public class TestArrays {

    public static void main(String[] xyz) {

        int[][] arr = new int[2][]; // {{0,0,0}, {0,0}}
        // arr[0][1] = 10; // NullPointerException
        arr[0] = new int[3];
        arr[1] = new int[2];

        int array[] = {2,5,9,5,0,3}; // Nur erlaubt bei gleichzeitiger Deklaration der Variable
        // array = {2,5,9}; // Error: Variable ist bereits deklariert
        array = new int[]{2,5,9}; // Ok

        array = new int[]{2,5,9,5,0,3};
        Arrays.sort(array, 2,6);
        System.out.println(Arrays.toString(array));

        //xyz = new String[]{"1", "2", "3"};

    }
}
