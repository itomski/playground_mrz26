package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // List<String> namen = new ArrayList<String>(); // Auch möglich

        // Generischer Typ: <String>
        // Generische Typen sind IMMER komplexe Typen
        List<String> liste1 = new ArrayList<>();
        liste1.add("Peter");
        liste1.add("Bruce");
        liste1.add("Carol");
        liste1.add("Steve");

        for(String s : liste1) {
            System.out.println(s.toLowerCase());
        }

        System.out.println();

        var namen2 = new ArrayList<String>();
        // ArrayList<String> namen2 = new ArrayList<String>();

        // Ohne angabe des generischen Typs wird Object verwendet
        List liste3 = new ArrayList(); // Raw Type ist automatisch Object
        liste3.add("Peter");
        liste3.add(123); // Autoboxing zu Integer
        liste3.add(123.123); // Autoboxing zu Double
        liste3.add('C'); // Autoboxing Character

        for(Object o : liste3) {
            System.out.println(o);
        }
    }
}
