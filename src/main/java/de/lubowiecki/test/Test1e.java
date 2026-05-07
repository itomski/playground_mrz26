package de.lubowiecki.test;

public class Test1e {

    public static void main(String[] args) {

        String s = "123";
        long l = new Long(s);
        l = Long.parseLong(s);
        // l = (new Long()).parseLong(s); // Long hat keinen parameterlosen Konstruktor
        // Long.longValue(s); // ist eine Instanzmethode
        l = ((Long)l).longValue();
        l = Long.valueOf(s).longValue(); // liefert ein primitive

        // valueOf:  baut ein Objekt. statisch
        // parseLong: liefert einen primitiven. statisch
        // longValue: liefert ein primitive. Ist eine Instanzmethode

    }
}
