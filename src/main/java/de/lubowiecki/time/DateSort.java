package de.lubowiecki.time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DateSort {

    // final: Inhalt der Liste darf sich verändern
    // Die Referenz darf NICHT mizt einer neuen Liste belegt werden
    final static List<LocalDate> zeitpunkte = new ArrayList<>();

    public static void main(String[] args) {

        // zeitpunkte = new ArrayList<>(); // Neue Liste darf auf diese Referenz nicht zugewiesen werden
        // final Random rand = new Random();

        // Inhalt der Liste darf sich ändern
        zeitpunkte.add(LocalDate.of(2015, 5, 22));
        zeitpunkte.add(LocalDate.of(2010, 7, 1));
        zeitpunkte.add(LocalDate.of(1999, 10, 7));
        zeitpunkte.add(LocalDate.of(1999, 10, 1));
        zeitpunkte.add(LocalDate.of(1999, 1, 5));
        zeitpunkte.add(LocalDate.of(2032, 2, 18));

//        Collection // Elternklasse von List (und anderen Collections)
//        Collections // Utility-Klasse mit Hilfsmethoden für Collections

        System.out.println(zeitpunkte);
        //zeitpunkte.sort(...);// Comparator
        Collections.sort(zeitpunkte); // Netürliche Reihenfolge
        System.out.println(zeitpunkte);

    }
}
