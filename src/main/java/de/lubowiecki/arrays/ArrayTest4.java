package de.lubowiecki.arrays;

public class ArrayTest4 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        arr[2] = 0;

        int[] arr2; // Verbraucht kein Speicher
        arr2 = new int[3]; // Hier wird der Speicher reserviert

        int[][] arr3 = new int[5][]; // {null, null, null, null, null}
        //arr3[0][1] = 5; // NullPointerException: Auf Index 0 ist eine null
        arr3[0] = new int[2];  // {{0,0}, null, null, null, null}
        arr3[0][1] = 5;  // {{0,5}, null, null, null, null}

        arr3[3] = new int[]{2,3,4};  // {{0,0}, null, null, {2,3,4}, null}

        int[][] arr4 = new int[3][2]; // {{0,0}, {0,0}, {0,0}}
    }
}
