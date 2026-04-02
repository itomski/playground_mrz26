package de.lubowiecki.kontrollstrukturen;

import java.util.Arrays;

public class ForSchleifenTest2 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        for(int inner  : arr) {
            // bei primitiven Datentypen ist inner eine Kopie des Wertes
            System.out.println(++inner);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println();


        int[][] arr2d = {{1,2,3}, {2,3,4}, {4,5,6}};

        for(int[] inner  : arr2d) {
            // Bei komplexen Datentypen (auch Arrays) wird eine Referenz in inner ableget
            System.out.println(inner);
            inner[0] = 100; // Über die Referenz kann der Inhalt des Originals verändert werden
        }

        System.out.println();

        for(int[] zeile  : arr2d) {
            for(int zelle  : zeile) {
                System.out.print(zelle + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr2d));

        System.out.println();

        arr = new int[]{10, 20, 30, 40, 50};

//        int inner;
//        for(inner  : arr) { // inner MUSS im Schleifenkopf deklariert werden, sonst Error
//            System.out.println(++inner);
//        }

    }
}
