package de.lubowiecki.test;

import java.util.ArrayList;
import java.util.List;

import static de.lubowiecki.test.Next.text;

public class TestFinal {

    public static void main(String[] args) {

        int[][] arr1 = new int[3][2]; // {{0,0},{4,0},{0,0}}
        arr1[1][0] = 4;

        int[][] arr2 = new int[3][]; // {null,null,null}
        //arr2[1][0] = 4; // NullPointerException

        List<String> strList = new ArrayList<>(10);

        String[] arr3[] = new String[5][]; // {null,{null,null},null,null,null}
        arr3[1] = new String[2];

        List<Integer> zahlen = new ArrayList<>();
        System.out.println(zahlen.get(10));

        System.out.println(Next.text);
        System.out.println(text);

        int i = 0;
        int sum = i++ + ++i;

    }
}

class Next {

    public static String text = "Moin";

}
