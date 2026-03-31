package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethodenTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();

        // Index ist immer ein positiver int-Wert

        namen.add("Peter"); // Wird an das Ende der Liste hinzugefügt
        namen.add("Natasha"); // Wird an das Ende der Liste hinzugefügt
        namen.add(0, "Bruce"); // Wird an passender Positiuon hinzugefügt
        namen.set(2, "Carol"); // Ersetzt das Element an Position
        System.out.println(namen); // Collections haben eine gute toString methode

        // namen.size() = Größe der Liste (Anzahl der entahltenen Elemente)
        for(int i = 0; i < namen.size() ; i++) {
            // namen.get(i) = liefert das Element an gewünschter Stelle
            System.out.println(namen.get(i));
        }

        namen.clear(); // Leeren
        System.out.println(namen);

        System.out.println("Leer: " + namen.isEmpty());

        namen.addAll(List.of("Peter", "Bruce", "Carol", "Natasha", "Steve", "Scott", "Tony"));
        System.out.println(namen);

        //namen.remove(2); // Löscht das Element an Pos 2
        namen.remove("Tony"); // Entfernt das passende Objekt
        System.out.println(namen);

        System.out.println();

        // Ausgabe
        for(int i = 0; i < namen.size() ; i++) {
            System.out.println(namen.get(i));
        }

        System.out.println();

        // Ausgabe
        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        // Ausgabe
        namen.forEach(System.out::println); // Methoden-Referenz oder ein Lambda


        List<String> list = new ArrayList<>();
        list.add("Hammer");
        list.add("Schraube");

        // Eine Referenz vom Typ List kann auf Objekte aller Klassen verweisen, die von List abgeleitet sind.

        list = new LinkedList<>(list); // ArrayList zu LinkedList

        list = new ArrayList<>(list); // LinkedList zu ArrayList


        list.add("Test1"); // nächste freie
        // entweder eine vorhandene oder die nächste freie Position
        list.add(5, "Test2"); // Error: Pos 5 nicht verfügbar

    }
}
