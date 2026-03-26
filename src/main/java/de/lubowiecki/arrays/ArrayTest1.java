package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        // Arrays sind Objekte
        int[] arr1 = new int[10]; // größe 10
        String[] arr2 = new String[5]; // größe 5
        arr2 = new String[10]; // größe 10

        arr1[0] = 50; // auf index 0 ein Wert abgelegt
        arr1[0] = 100; // 50 wird überschrieben
        arr1[5] = 123;

        // arr1[10] = 234; // ArrayIndexOutOfBoundsException: letzter Index = 9
        // arr1 = new int[-10]; // NegativeArraySizeException

        arr1 = Arrays.copyOf(arr1, 20); // Übernimmt die alten Werte

        System.out.println(arr1); // [I@27716f4
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr2, "..."); // Füllt das Array
        System.out.println(Arrays.toString(arr2));

        System.out.println();

        arr1 = new int[]{2,5,6,8,22,9}; // Array wird erzeugt und befüllt
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = {2,5,6,8,22,9}; // Nur bei gleichzeitiger Deklaration der Variable erlaubt
        //arr3 = {2,7,9}; // Error: Variable ist bereits deklariert
        arr3 = new int[]{2,7,9}; // OK

        System.out.println();

        for(int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        System.out.println();

        for(int e : arr3) {
            System.out.println(e);
        }

        System.out.println();

        Arrays.stream(arr3).forEach(e -> System.out.println(e));

        System.out.println();

        int[] arr4 = genArray();
        for(int e : arr4) {
            System.out.println(e);
        }
    }

    public static int[] genArray() {
        return new int[]{1,2,3,4,5,6};
    }
}
