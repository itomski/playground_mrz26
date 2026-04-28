package de.lubowiecki;

import java.util.HashSet;
import java.util.Set;

public class InitializerTest3 {

    int a;
    int b;

    static {
        int a = 10;
        int b = 20;
    }

    {
        int a = 30;
        int b = 40;
    }

    public static void main(String[] args) {

        InitializerTest3 it3 = new InitializerTest3();
        System.out.println(it3.a);
        System.out.println(it3.b);

        // Set ist eine Menge (nicht sortiert)
        Set<String> namen = new HashSet<>();
        namen.add("Peter");
        namen.add("Natasha");
        namen.add("Carol");
        namen.add("Bruce");

        for(String n : namen) {
            System.out.println(n);
        }

        System.out.println();

        namen.forEach(System.out::println);

    }
}
