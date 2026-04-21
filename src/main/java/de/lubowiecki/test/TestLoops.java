package de.lubowiecki.test;

import java.util.ArrayList;
import java.util.List;

public class TestLoops {

    public static void main(String[] args) {

        List<String> ints = new ArrayList<>();
        ints.add("A");
        ints.add("B");
        System.out.println(ints.remove(0)); // A
        System.out.println(ints.remove(0)); // B

        ints.add("A");
        ints.add("B");
        System.out.println(ints.remove("A")); // true
        System.out.println(ints.remove("X")); // false


        while (true) {
            break;
        }

        System.out.println("...");

    }

}
