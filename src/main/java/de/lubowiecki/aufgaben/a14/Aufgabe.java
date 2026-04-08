package de.lubowiecki.aufgaben.a14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe {

    /*
    Schreibe ein Kommandozeilen-Programm welches eine Sammlung von Produkten verwalten
    kann. Jedes Produkt soll ein Objekt sein, welches Datum (Aufnahme in den Bestand), Name,
    Beschreibung, Menge und Preis als Eigenschaften enthält.
    Folgende Aktionen sollen möglich sein:
    1. Erstellen eines neuen Produkts
    2. Ausgabe aller vorhandener Produkte
    3. Sortierte Ausgabe (nach Aufnahme in den Bestand) (optional)

    Die Daten sollen nicht dauerhaft gespeichert werden d.h. nach der Beendigung des
    Programms gehen alle eingegeben Daten verloren.

    Erweiterung
    Implementiere eine Klasse VerderblichesProdukt.
    Diese Klasse soll von Produkt erben und es um ein Verfallsdatum erweitern.
    Die Benutzeroberfläche soll so erweitert werden, dass der Benutzer entscheiden kann, ob er
    ein „normales“ Produkt oder ein VerderblichesProdukt erfassen möchte.
    Die Ausgabe verderblicher Produkte soll das Verfallsdatum enthalten.
     */

    private static final String TAB_ROW = "| %-15s | %-20s | %6d | %6.2f € | %10s | \n";
    //private static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    private static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd/MM/yy");

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Hammer", "Ganz toll", 10, 19.99));
        LocalDate mhd = LocalDate.of(2026, 8, 1);
        produkte.add(new VerderblichesProdukt("Milch", "1,5% Fett", 100, 1.19, mhd));
        mhd = LocalDate.of(2026, 7, 22);
        produkte.add(new VerderblichesProdukt("Milch", "3,5% Fett", 100, 1.29, mhd));

        printProduct(produkte);
    }

    private static void printProduct(List<Produkt> produkte) {
        for(Produkt p : produkte) {
            if(p == null) break;

            String mhd = "KA";
            if(p instanceof VerderblichesProdukt) {
                mhd = ((VerderblichesProdukt) p).getMhd().format(DATE_FMT);
            }

            System.out.printf(TAB_ROW, p.getName(), p.getBeschreibung(), p.getMenge(), p.getPrice(), mhd);
        }
    }

}
