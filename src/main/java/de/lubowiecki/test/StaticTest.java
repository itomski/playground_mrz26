package de.lubowiecki.test;

public class StaticTest {

    // statische Variablen werden als erstes Deklariert!!!!
    // Initialisierung der statischen Variablen und statische Initializer sind gleichwertig
    // instanz Variablen werden deklariert
    // Initialisierung der Instanz-Variablen und Instanz-Initializer sind gleichwertig
    // Rest des Konstruktors

    public StaticTest() {
        i1 = print("11");
    }

    {
        i1 = print("8");
    }
    String i1 = print("9");
    String i2 = print("10");

    static {
        s1 = print("1");
        s2 = print("2");
    }

    static String s1 = print("3");

    static String s2 = print("4");

    static String s3 = print("5");
    static {
        s3 = print("6");
        s1 = print("7");
    }

    public static void main(String[] args) {
        new StaticTest();
    }

    private static String print(String s) {
        System.out.println(s);
        return s;
    }
}
