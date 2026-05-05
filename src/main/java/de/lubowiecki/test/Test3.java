package de.lubowiecki.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import static java.lang.Math.pow;

public class Test3 {

    public static void main(String[] args) {

        int[][] arr = new int[3][1]; // {null, {1,2,3}, null}
        arr[1] = new int[]{1,2,3};

        System.out.println();

        arr = new int[2][]; // {null, null}
        //Arrays.sort(arr[1]);

        //machWas();

        int[] arr2 = {}; // Leeres Array
        arr2 = new int[]{}; // Leeres Array
        arr2 = new int[0]; // Leeres Array

        System.out.println(pow(2, 5));

        //System.out.println(new Date(20, 10, 1));
        System.out.println(LocalDate.of(2000, 10, 1));

        int zahl = 808;
        System.out.printf("%s \n", zahl);
        System.out.printf("%05d %n", zahl);
        float zahl2 = 10;
        System.out.printf("%.2f %n", zahl2);


//        do {
//            int i = 10;
//            System.out.println(i++);
//        } while(i < 5); // i: hier nicht mehr sichtbar


        int j; // lokale variable
        do {
            j = 10;
            System.out.println(j++);
        } while(j < 100);

        for(int i = 0; i < 100; i++) {
            System.out.println(i);
            i++;
        }

        // i : hier nicht mehr verfügbat

    }

    static void machWas() {
        machWas();
    }

    // überlagert die importierte Methode aus Math
    static int pow(int a, int b) {
        return a + b;
    }
}
