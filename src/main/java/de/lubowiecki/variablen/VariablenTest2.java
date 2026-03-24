package de.lubowiecki.variablen;

import java.util.Arrays;

public class VariablenTest2 {

    // Instanz- und Klassenvariablen werden automatisch mit Standardwerten initialisiert

    // Instanzvariable
    public int zahl;

    // Klassenvariable
    public static int andereZahl;


    // Rückgabetyp: void (Nichts)
    // public: Sichtbarkeit der Methode (public = alle)
    // static: Klassenmethode (Methode kann direkt auf dem Bauplan ausgeführt werden)

    // java de.lubowiecki.variablen.VariablenTest2 2 Hallo Peter 42
    // args = Argumente die beim Start des Programms übergeben werden
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));


        // byte < short < int < long < float < double
        //         char <

        // Lokale Variablen
        int i = 100;
        var j = 200;
        //j = 2.0;
        System.out.println(i);
        System.out.println(100); // Literal
        System.out.println(j);

        boolean ok = true;
        ok = false;
        System.out.println("Wahr? " + ok);
        // System.out.println(ok + 1); // boolean ist kein mathematischer Wert

        // Lokale Variablen: Werden innerhalb von Methoden deklariert
        // Lokale Variablen bekommen KEINEN Standardwert
        boolean nichtOk;
        //System.out.println(nichtOk); // Error: Jede lokale Variable MUSS vor der Verwendung initialisiert werden

        var name = "Peter";
        System.out.println(name);
        System.out.println("Peter"); // Literal

        byte kleineZahl1 = -120;
        byte kleineZahl2 = 120;
        int iSum = kleineZahl1 + kleineZahl2; // byte, short werden zum Rechnen mind. auf int angehoben
        kleineZahl1++; // kleineZahl = (byte)(kleineZahl + 1)
        kleineZahl1 += 5; // kleineZahl = (byte)(kleineZahl + 5)
        kleineZahl1 += kleineZahl2; // kleineZahl = (byte)(kleineZahl + kleineZahl2)

        byte b = 126;
        b += 1000;
        System.out.println(b);

        short s1 = 25500;
        short s2 = 25500;
        //var sSum = s1 + s2; // sSum ist ein int
        var sSum = s1 + s2;

        System.out.println(sSum);

        // Besonders gängig: int, long, double

        // Ganzzahlen-Literale sind per default ints
        machWas(5); // Error: 100 ist ein Int-Literal
        machWas(b); // Ok. b ist ein byte
        machWas((byte)100); // Int-Literal wird in byte gecastet

        long l1 = 10; // primitive widening von int auf long
        var l2 = 100_000_000_000L; // kein primitive widening
        var l3 = 100l; // Long Literal

        machWas(10L);

    }

    static void machWas(byte b) {
        System.out.println("BYTE: " + b);
    }

    static void machWas(float b) {
        System.out.println("FLOAT: " + b);
    }

    static void machWas(double b) {
        System.out.println("DOUBLE: " + b);
    }
}
