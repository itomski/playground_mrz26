package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha", "Tony", "Scott"));
        Collections.sort(namen);
        int pos = Collections.binarySearch(namen, "Max");
        System.out.println(namen);
        System.out.println(pos);




    }
}
