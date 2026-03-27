package de.lubowiecki.arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        int[] a, b, c; // Alle Variabblen vom Typ int-Array
        int d, e[], f; // d und f sind ints, e ist ein int Array
        int[] g, h[], x; // g und x sind int-Arrays, h ist ein 2d int-Array

//        int[] arr[];
//        int[][] arr;
//        int arr[][];

        int[][] arr = new int[3][2];
        /*
        {
            0: {0: 0, 1: 0}
            1: {0: 0, 1: 0}
            2: {0: 0, 1: 0}
        }
        */
        int[][] arr1 = new int[3][];
        arr1[1] = new int[]{5, 7, 22};
        arr1[0] = new int[]{100};
        arr1[2] = new int[]{};
        /*
        {
            0: {0: 100}
            1: {0: 5, 1: 7, 2: 22}
            2: {}
        }
        */

        System.out.println(arr1[1][2]);
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] zeile : arr1) {
            for(int element : zeile) {
                System.out.print(element + ", ");
            }
            System.out.println();
        }

        System.out.println();

        //double[] arr3 = new int[]{1,2,3}; // Error: Kein primitiv windening!

        byte y = (byte)65_534;
        System.out.println(y);

    }
}
