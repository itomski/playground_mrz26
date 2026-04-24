package de.lubowiecki.test;

import java.io.IOException;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        // Array überschreibt equals nicht. D.h. Identitätsvergleich, da aus Object geerbt
        System.out.println(arr1.equals(arr2));
        System.out.println(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.equals(arr1, arr2)); // Inhaltsvergleich
        //System.out.println(Arrays.deepEquals(arr1, arr2)); // Inhaltsvergleich

        System.out.println();

        int[][] arr11 = {{1,2},{2,3}};
        int[][] arr22 = {{1,2},{2,3}};
        System.out.println(Arrays.equals(arr11, arr22));
        System.out.println(Arrays.deepEquals(arr11, arr22));

        String[] arr111 = {"Peter", "Bruce"};
        String[] arr222 = {"Peter", "Bruce"};
        System.out.println(Arrays.equals(arr111, arr222));
        System.out.println(Arrays.deepEquals(arr111, arr222));

        try {

        } catch (Exception e) { // Unchecked-Exceptions & Exception können immer gefangen werden
            //...
        }

//        try {
//
//        } catch(IOException e) { // Alle anderen Checked-Exceptions müssen entstehen können, damit sie gefangen werden können
//            //...
//        }

        // Convertierung
        int i = Integer.parseInt("123"); // NumberFormatException
        //Integer j = (Integer)"123";
        Integer ii = 20;
        System.out.println(ii.doubleValue());


        Object o = "123";
        // Casting
        // Integer j = (Integer)o; // ClassCastException: String ist KEIN Integer

        System.out.println(Math.PI);

    }


}
