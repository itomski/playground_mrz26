package de.lubowiecki.variablen;

public class VariablenTest {

    // Einstiegspunkt für den Interpreter
    public static void main(String[] args) {

        // Lokale Variablen = Variablen, die in einer Methode deklariert werden

        // Deklaration(Servierung) und Initialisierung(Erste Wertzuweisung) einer Variable
        int zahl = 200;

        int zahl2; // Deklaration
        zahl2 = 500; // Zuweisung (Initialisierung)
        zahl2 = 20; // Zuweisung

        // andereZahl = 20; // CompilerError: Variable unbekannt
        // zahl2 = 20.5; // CompilerError: Variable vom Typ int, Wert vom Typ double

        byte kleineZahl = -20;
        String str = "Das ist das Haus von Nikigraus!";

        System.out.println(zahl + 100);
        System.out.println(kleineZahl * 5);
        System.out.println(str + 5 + "..."); // + führt bei String zu einer Verkettung

        int sum = zahl + zahl2 + kleineZahl;
        System.out.println(sum);

        double erg = add(10, 15);
        System.out.println(erg);
        System.out.println("Erg. der Berechnung ist " + erg);
        //System.out.println(add(10, 15)); // Sofortige Ausgabe

        System.out.println(); // Zeilenumbruch

        erg = add(zahl, zahl2);
        System.out.println("\nErg. der Berechnung ist " + erg); // \n = neue Zeile

    }

    // Klassenmethode: Kann direkt auf dem Bauplan ausgeführt werden
    public static double add(double a, double b) {
        return a + b;
    }

    // Bitte Schreibt 3 weitere Methoden für Multiplikation, Subtraktion und Division
    // und test sie.

}
