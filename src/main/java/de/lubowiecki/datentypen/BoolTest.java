package de.lubowiecki.datentypen;

public class BoolTest {

    public static final boolean TRUE = true;

    public static void main(String[] args) {

        int zahl1 = 100; // primitiv
        Integer zahl2 = 100;
        Integer zahl3 = 100;

        // Wertvergleich
        System.out.println(zahl1 == zahl2); // wenn einer der Operanden primitiv ist, wird der zweite augepackt
        //System.out.println(zahl1.equals(zahl2)); // Error: primitive Datentypen haben keine Methoden

        // Identitätsvergleich
        System.out.println(zahl2 == zahl3); // Pool wird verwendet (Byte-Literal-Pool)
        // Wertvergleich
        System.out.println(zahl2.equals(zahl3));

        System.out.println();

        // Byte-Literal-Pool: Alle Ganzzahlen-Wrapper (Byte, Short, Integer und Long) im Wertbereich von Byte (-128 bis 127)
        // liegen bereits im Pool als fertige Objekte
        zahl2 = 1200;
        zahl3 = 120;
        System.out.println(zahl2 == zahl3);
        System.out.println(zahl2.byteValue());
        System.out.println((byte)(zahl2 + 0)); // Wrappertypen werden zum Rechen ausgepackt

        Long zahl4 = 120l;
        Long zahl5 = 120l;
        System.out.println(zahl4 == zahl5);
        System.out.println(zahl4.byteValue());
        System.out.println((byte)(zahl5 + 0));




    }
}
