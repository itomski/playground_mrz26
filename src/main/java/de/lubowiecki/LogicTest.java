package de.lubowiecki;

import java.lang.reflect.Method;

public class LogicTest {

    public static void main(String[] args) {

        String eingabe = null;

        if(eingabe != null && eingabe.length() > 0) {
            System.out.println("Eingabe: " + eingabe);
        }

//        if(eingabe != null & eingabe.length() > 0) {
//            System.out.println("Eingabe: " + eingabe);
//        }

        // 00001011
        // 00000101

        System.out.println(11 & 5); // Bitwise-Operatoren verarbeiten boolean und Zahlen
        //System.out.println(10 && 5); // Logische Operatoren funktionieren NUR mit boolean

        int i = 10;
        i = i++; // Postfix geht durch das Überschreiben der Variable verloren
        System.out.println(i);

        Boolean b = new Boolean(); // Klassennamen sind keine Key-Words
        java.lang.Boolean b2 = java.lang.Boolean.valueOf(true);

        Integer j = 10; // Autoboxing: primitiver Datentyp wird zum Wrapper-Typ
        int k = j; // AutoUnboxing: Wrapper-Typ wird zum primitiver Datentyp

        long l = k; // Widening: int wird zu long
        k = (int)l; // Narrowing: long wird zum int

        Integer i2 = 250;
        Integer i4 = 250;
        System.out.println(i2 == i4); // false
        System.out.println(i2.equals(i4)); // true

        System.out.println();

        i2 = 120; // Byte-Literal-Pool (-128 bis 127) für alle Ganzzahlen Wrapper
        i4 = 120;
        System.out.println(i2 == i4); // false
        System.out.println(i2.equals(i4)); // true

        Integer i3 = i2;

        short s = 10;
        shortTest((short)10);
        floatTest(10.0f);
        longTest(10_000); // primitive widening

        LogicTest lt = new LogicTest();
//        for(Method m : lt.getClass().getDeclaredMethods()) {
//            System.out.println(m);
//        }

        try {
            Method m = lt.getClass().getDeclaredMethod("machWas", String.class);
        }
        catch (NoSuchMethodException e) {
            System.out.println("Methode nicht vorhanden");
        }

        int i5 = 10;
        int i6 = 3;
        double erg = (double)i5 / i6;
        System.out.println(erg);


        // www.abc.de/user/add
        // UserController::add()
    }

    static void shortTest(short s) {

    }

    static void floatTest(float f) {

    }

    static void longTest(final long l) {
        // l = 200; // l kann nicht mehr verändert werden
    }

    void longTest(double l) {
        // l = 200; // l kann nicht mehr verändert werden
    }
}

// Eine eigene Klasse mit dem Namen Boolean
class Boolean {
}
