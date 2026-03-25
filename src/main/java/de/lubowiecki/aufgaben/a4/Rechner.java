package de.lubowiecki.aufgaben.a4;

public class Rechner {

    private static String protokoll = "";
    private static final String TPL = "%f %s %f = %f \n";

    public static double add(double a, double b) {
        double erg = a + b;
        protokoll += String.format(TPL, a, '+', b, erg);
        return erg;
    }

    public static double multi(double a, double b) {
        double erg = a * b;
        protokoll += String.format(TPL, a, '*', b, erg);
        return erg;
    }

    public static double sub(double a, double b) {
        double erg = a - b;
        protokoll += String.format(TPL, a, '-', b, erg);
        return erg;
    }

    public static double div(double a, double b) {
        double erg = a / b;
        protokoll += String.format(TPL, a, '/', b, erg);
        return erg;
    }

    public static String getProtokoll() {
        return protokoll;
    }
}
