package de.lubowiecki;

public class ReihenfolgeTest {

    // Deklaration statischer Variablen
    // Initialisierung statischer Variablen mit Vorgabe
    //      (oder falls nicht im statischen Initializer initialisiert, dann Standardwert)
    // Static Initializer

    // ---- WENN EIN OBJEKT AUS EINER KLASSE ERZEUGT WIRD -----
    // Konstruktor der Elternklasse (super())
    // Deklaration Instanz-Variablen
    // Initialisierung von Instanz-Variablen mit Vorgabe
    //      (oder falls nicht im Instanz-Initializer oder Konstruktor initialisiert, dann Standardwert)
    // Instanz-Variablen
    // Rest des Konstruktors

    int x = 10; // Vorgabe
    int y; // Keine Vorgabe

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String str = "ABC";
        str.substring(2, 0); // ArrayIndexOutOfBounds (Startindex > Endindex)
        str.substring(-1, 3); // ArrayIndexOutOfBounds (Startindex negativ)
        str.substring(0, 15); // ArrayIndexOutOfBounds (String hat keinen Index 15)
        str.indexOf("C"); // -1

    }
}
