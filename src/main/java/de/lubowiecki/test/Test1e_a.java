package de.lubowiecki.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test1e_a {

    public static void main(String[] args) {

        List s1 = new ArrayList(); // Verwendet per default Object (RAW-Type)
        s1.add("a"); // 0
        s1.add("b"); // 1 -> 2
        s1.add(1, "c"); // 1
        System.out.println(s1); // verwendet toString der ArrayList
        System.out.println(s1.get(1)); // c

        // Erzeugt eine Liste mit vorgegebenen Elementen
        // Arrays.asList liefert eine fixed-sized Liste
        // List sub = new ArrayList(Arrays.asList(2,4,7,9,22,18,1));

        List sub = new ArrayList(s1.subList(1, 3)); // ArrayList wird mit den Elementen der subList befüllt
        System.out.println(sub);
        s1.addAll(sub); // Fügt s1 alle Elemente von sub hinzu
        System.out.println(s1);

        Super s2 = new Super(); //1
        Sub s3 = new Sub ();
        s2 = (Super) s3;

        Object t = new Integer(107);
        //int k = (Integer) t.intValue() / 9; // Error: t ist ein Object
        int k = ((Integer) t).intValue() / 9;

        k = (Integer) t / 9;

        Long t2 = new Long(107);
        k = (Integer) t2.intValue() / 9;
        System.out.println(k);


        int j = 10;
        //int w = 15;
        // j = 15; // ist nicht mehr effektif final durch neuzuweisung
        Predicate<Integer> pred = w -> w < j; // Lambdas können auf Lokale-, Instanz- und Klassenvariablen zugreifen
        // Lokale Variablen umgebender Methode, die in Lambdas verwendet werden müssen final oder effektiv final sein
        // effektiv final = sind nicht final, ändern sich aber nicht

    }

    void machWas() throws IOException {
        //try {
            readFile();
//        } catch (Exception e) {
//            //...
//        }
    }

    String readFile() throws IOException {
        return null;
    }

}

class Super { }
class Sub extends Super { }