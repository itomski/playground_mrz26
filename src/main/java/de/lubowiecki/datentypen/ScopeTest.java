package de.lubowiecki.datentypen;

public class ScopeTest {

    // Nur Instanz- und Klassenvariablen sind über den Methodenaufruf hinaus verfügbar

    // Instanzvariablen
    // Verfügbar, solange das Objekt verfügbar ist.
    // Müssen über das Objekt verwendet werden

    // Klassenvariablen
    // Ab dem Laden der Klasse bis zum Ende des Programms verfügbar
    // Werden über die Klasse verwendet

    // Instanzmethoden können ALLE Instanz- und Klassenvariablen verwenden

    // Klassenmethoden dürfen nur Klassenvariablen verwenden

    public static void main(String[] args) {

        int lokaleVariable = 100; // Nur in der Methode (ggfl Block) sichtbar, in der sie deklariert sind

//        do {
//            boolean ok = true;
//        } while(ok); // ok ist out-of-scope

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ", " + j);
            }
        }

//        System.out.println(i); // i ist out-of-scope

        for(int zahl : new int[]{1,2,3,4}) {
            System.out.println(zahl);
        }
//        System.out.println(zahl); // zahl ist out-of-scope
    }

    public static void machWas() {
//        System.out.println(lokaleVariable); // lokaleVariable ist out-of-scope
    }
}
