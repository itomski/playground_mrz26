package de.lubowiecki.aufgaben.a15;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe {

    /*
        Schreibe eine Klasse die sowohl das Interface (MyInterface) implementiert als auch die Klasse erweitert.
        Überschreibe dabei alle Methoden der Klasse
    */

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();

        int zahl = 10; // Primitive Datentypen haben KEINE Methoden

        Integer zahl2 = 10;
        zahl2.intValue(); // Wrappertypen haben Instanzmethoden
        Integer.toBinaryString(100); // Wrappertypen haben auch Klassenmethoden

    }
}

interface MyInterface {

    int method1(int a, int b, int c);

    boolean method2(String str);

    Number method3(Integer i, int j);
}

abstract class MyClass {

    // package-private
    int method4(int a, int b) {
        return a - b;
    }

    protected boolean method5(String str) {
        return str.length() == 2;
    }

    final int method6(String str) {
        return str.length() - 10;
    }

    abstract String[] method7(String str);
}

class KonkreteKlasse extends MyClass implements MyInterface {

    @Override
    public int method1(final int a, final int b, final int c) {
        return a + b + c;
    }

    @Override
    public boolean method2(String str) {
        return str.length() == 10;
    }

    @Override
    public Integer method3(Integer i, int j) { // Ok: Integer ist kompatibel mit Number
        return i + j;
    }

    @Override
    public int method4(int a, int b) {
        return a % b;
    }

    @Override
    public boolean method5(String str) {
        return str.length() < 10;
    }

    // method6 ist final. dh kann nicht überschrieben werden

    @Override
    protected String[] method7(String str) {
        if(str.equals("...")) {
            // return verlässt die Methode
            return new String[]{"A", "B", "C"};
        }
        return str.split("-");
    }

    public String create() {
        return "Hallo";
    }
}
