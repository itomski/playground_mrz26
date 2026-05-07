package de.lubowiecki.test;

import java.util.ArrayList;
import java.util.List;

public class ReferenzTest {

    public static void main(String[] args) {

        List<Integer> ints1 = new ArrayList<>();
        List<Integer> ints2 = new ArrayList<>();
        change(ints1, ints2);
        System.out.println(ints1 + "," + ints2);

    }

    static void change(List<Integer> list1, List<Integer> list2) {
        list1.add(100);
        list2 = list1;
    }
}
