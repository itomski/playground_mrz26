package de.lubowiecki;

import java.time.LocalTime;

// de.lubowiecki.FirstSteps
public class FirstSteps {

    public static void main(String[] /* Bla bla */ args) {

        // Namenskonventionen
        // PascalCase: Wird für Klassen-Namen (Typen) verwendet
        // camelCase: Variablen und Methoden
        // snake_case: Wird in Java nicht verwendet!
        // SCREAMING_SNAKE_CASE: Wird für Konstanten benutzt
        // kebap-case: Wird in Java nicht verwendet!

        System.out.println("Das ist ja toll!"); // sout

        // Alle Klassen aus dem Package java.lang sind automatisch importiert
        System.out.println(Math.PI);

        /*
        int zahl1 = 100;
        //zahl1 = 10.0;

        double zahl2 = 10.0;
        zahl2 = 100;
        */

        LocalTime lt2 = LocalTime.now();

        System.out.println(addieren(15, 22));

        // Klasse: Bauplan
        // Referenz: Variable, die auf ein Objekt verlinkt
        // Obejekt: Ein bestimmtes Buch (Objekt ist mit einem Zustand befüllt)

        // s1 = Referenz
        // "Hallo" = String Objekt auf dem Heap
        // String = Klasse
        String s1 = "Hallo";
        String s2 = new String("Hallo");
        s2 = null;

        // primitiver Datentyp
        int i = 100;
        byte b = 25;
        char c = 'C';


    }

    /**
     * Addiert zwei Ganzzahlen
     * @param a Linker Operand
     * @param b Rechter Operand
     * @return Summe aus a und b
     */
    public static int addieren(int a, int b) {
        return a + b;
    }
}
