package de.lubowiecki.variablen;

public class KonstantenTest {

    public static void main(String[] args) {

        // Lokale Variablen bekommen keine Standardwerte

        final int zahl1; // Runtime Konstante
        zahl1 = 10;
        // zahl1 = 15; // Error: Änderung nicht erlaubt

        final int zahl2 = 10; // Compiletime-Konstante
        // zahl2 = 25; // Error: Änderung nicht erlaubt

        int i;

        System.out.println("Ende: " + zahl1);
        System.out.println("Ende: " + zahl2);

        Object o = new Object();
        System.out.println(o.hashCode());


        int eingabe = 15;

        switch(eingabe) {
            case 10:
                System.out.println("A");
                break;

            case zahl2 + 2:
                System.out.println("B");

//            case zahl1 + 2: // Muss eine Compiletime-Konstante sein
//                System.out.println("C");
        }

    }
}
