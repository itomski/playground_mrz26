package de.lubowiecki.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6d {

    public static void main(String[] args) {

        //LocalDate ld = LocalDate.now().plusDays(1);
        //LocalDate ld = LocalDate.now().plusWeeks(5);
        LocalDate ld = LocalDate.now().plus(5, ChronoUnit.WEEKS);

        Period p = Period.ofDays(5);
        LocalDate ld2 = LocalDate.now().plus(p);

        String s1 = "1234";
        String s2 = new String("1234");

        List<Object> list = new ArrayList<>();
        list.add(new String("1234")); // 0
        list.add(new String[]{"abc", "cde"}); // 1
        list.add(new Person()); // 2
        list.add(new Emp()); // 3

        System.out.println(list);

        Object o1 = new int[10];
        Object o2 = new Integer(10);
        Object o3 = new Integer[10]; // Integer-Array ist ein Object
        //Integer o5 = new Integer[10]; // Error: Integer-Array ist KEIN Integer
        Object o4 = new Object[10];
        int[] arr = new int[10];

        System.out.println(o1.toString());
        System.out.println(Arrays.toString(((String[])list.get(1))));

    }
}

class Person {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
class Emp extends Person {}
