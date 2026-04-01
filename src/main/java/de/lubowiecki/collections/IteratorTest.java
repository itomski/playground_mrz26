package de.lubowiecki.collections;

import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {

        // List.of produzier eine Fixed-Size-Liste

        // Ab Java 9 List.of(...)
        List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha", "Tony", "Scott"));
        // Davor Arrays.asList(...)
        //List<String> namen = new ArrayList<>(Arrays.asList("Peter", "Bruce", "Carol", "Natasha", "Tony", "Scott"));
        namen.add("Steve");
        System.out.println(namen);

        //List<String> namen = List.of("Peter", "Bruce", "Carol", "Natasha", "Tony", "Scott");
        //namen.add("Steve"); // UnsupportedOperationException

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            String value = itr.next();
            if(value.equalsIgnoreCase("Natasha")) continue;
            System.out.println(value);
        }

        // namen.sort(...); // brauch einen Comparator

        // String ist Comparable (d.h. definiert eine natürliche Reihenfolge)
        Collections.sort(namen);
        System.out.println(namen);


    }
}
