package de.lubowiecki.aufgaben.a9;

public class Produktverwaltung {

    /*
    Übung
    Schreibe ein Kommandozeilen-Programm welches eine Sammlung von Produkten verwalten
    kann. Jedes Produkt soll ein Objekt sein, welches Datum (Aufnahme in den Bestand), Name,
    Beschreibung, Menge und Preis als Eigenschaften enthält.

    Folgende Aktionen sollen möglich sein:
            1. Erstellen eines neuen Produkts
            2. Ausgabe aller vorhandener Produkte

    Die Daten sollen nicht dauerhaft gespeichert werden d.h. nach der Beendigung des
    Programms gehen alle eingegeben Daten verloren.
    */

    private static final String TAB_ROW = "| %-15s | %-20s | %6d | %6.2f € | \n";

    public static void main(String[] args) {

        int pos = 0;

        Produkt[] produkte = new Produkt[10];
        produkte[pos++] = new Produkt("Butter", "Lecker", 100, 1.99);
        produkte[pos++] = new Produkt("Milch", "1,5% Fett", 100, 1.19);
        produkte[pos++] = new Produkt("Milch", "3,5% Fett", 100, 1.29);

        /*
        0: Produkt
        1: Produkt
        2: Produkt
        3: null
        4: null
        5: null
        6: null
        7: null
        8: null
        9: null
        */

        printProduct(produkte);
    }

    private static void printProduct(Produkt[] produkte) {
        for(Produkt p : produkte) {
            if(p == null) break;
            System.out.printf(TAB_ROW, p.getName(), p.getBeschreibung(), p.getMenge(), p.getPrice());
        }
    }
}
