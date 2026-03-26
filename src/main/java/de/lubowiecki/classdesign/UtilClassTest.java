package de.lubowiecki.classdesign;

import java.util.Arrays;

public class UtilClassTest {

    private final static int count;

    private final static String text;

    static {
        count = 42;
        text = "Das ist mein Text: " + count;
    }

    public static void main(String[] args) {

        // Math m = new Math(); // privater Konstruktor
        System.out.println(Math.random());
        System.out.println(Math.PI);
        System.out.println(Math.floor(3.12345));

        String[] parts = TextUtils.splitByChar("Das ist das \"Haus\" von Nikigraus!");
        System.out.println(Arrays.toString(parts));

        UtilClassTest t1 = new UtilClassTest();
        UtilClassTest t2 = new UtilClassTest();
        UtilClassTest t3 = new UtilClassTest();
        UtilClassTest t4 = new UtilClassTest();
        System.out.println(t1.text);
        System.out.println(t2.text);
        System.out.println(t3.text);
        System.out.println(t4.text);

    }
}

