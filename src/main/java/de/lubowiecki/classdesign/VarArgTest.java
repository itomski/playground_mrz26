package de.lubowiecki.classdesign;

import java.util.Arrays;

public class VarArgTest {

    public static void main(String[] args) {

        System.out.println(add(10, 15));
        System.out.println(add(10, 15, 22, 100, -5, 22, 9));
        System.out.println(add());

        int i = 1, j = 2, k;

        String str1, str2;

    }

    static int add(int a, int b) {
        return a + b;
    }

    // v ist ein Array
    static int add(int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }
}
