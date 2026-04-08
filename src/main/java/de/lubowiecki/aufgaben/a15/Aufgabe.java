package de.lubowiecki.aufgaben.a15;

public class Aufgabe {

    /*
        Schreibe eine Klasse die sowohl das Interface (MyInterface) implementiert als auch die Klasse erweitert.
        Überschreibe dabei alle Methoden der Klasse
    */

}

interface MyInterface {

    int compute(int a, int b, int c);

    boolean check(String str);

    Number checkType(Integer i, int j);
}

abstract class MyClass {

    int add(int a, int b) {
        return a - b;
    }

    protected boolean checkStr(String str) {
        return str.length() == 2;
    }

    final int checkOtherStr(String str) {
        return str.length() - 10;
    }

    abstract String[] splitStr(String str);
}
