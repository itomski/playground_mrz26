package de.lubowiecki.variablen;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hallo"; // Landet im String-Literal-Pool
        String s2 = new String("Hallo"); // Landen nicht im Pool
        String s3 = new String("Hallo"); // Erzeugt jedes Mal ein neues Objekt auf dem Heap
        String s4 = "Hallo"; // Referenz auf das Objekt im Pool
        s2 = s2.intern(); // Leitet die Referenz auf das Objekt im Pool um

        // Komplexe Datentypen enthalten Methoden

        // Strings sind Immutable (Nicht veränderbar)
        s1 = s1.toUpperCase(); // Methoden von String produzieren ein neues String Objekt
        System.out.println(s1);

        // Primitive Datentypen haben keine Methoden
        int i = 100;

        s1 += "A"; // s1 = s1 + "1";
        s1 += "B";
        s1 += "C";

//        String s = "A";
//        for (int j = 0; j < 1_000_000; j++) {
//            s += j;
//        }
//        System.out.println(s);
        // machWas();
    }

    static void machWas() {
        machWas();
    }

}
