package de.lubowiecki.classdesign;

import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("HH-AB123", "VW", "Polo", 2000);
        Fahrzeug f2 = new Fahrzeug("HH-AB123", "VW", "Polo", 2000);

        System.out.println(f1 == f2); // Referenz
        System.out.println(f1.equals(f2)); // Inhalt

        // Wenn eine Klasse keine eigene equals-Methode hat, wird die aus Objekt verwendet
        // Diese vergleicht per default die Referenzen


        System.out.println(f1.equals("Moin"));
        System.out.println(f1.equals(null));

        System.out.println(Objects.equals(f1, f2));

        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());


    }
}
