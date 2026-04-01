package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CloneTest {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Peter", "Parker", 25));
        list.add(new Person("Bruce", "Banner", 42));
        list.add(new Person("Carol", "Danvers", 31));
        list.add(new Person("Carol", "Ansen", 52));
        list.add(new Person("Steve", "Rogers", 92));

        ArrayList<Person> copy = (ArrayList<Person>) list.clone();

        // List<Person> copy = new ArrayList<>(list);

        System.out.println(list.get(1));
        System.out.println(copy.get(1));

        System.out.println();

        copy.get(1).setAlter(52);
        System.out.println(list.get(1));
        System.out.println(copy.get(1));

        List<Person> other = new LinkedList<>(list); // Elemente werden nicht kopiert, nur Referenzen





    }
}
