package de.lubowiecki.methoden;

public class InnerClassTest {

    public static void main(String[] args) {

        char c  = 'c';
        c++; //c = (char)(c + 1)

        // Die Inner setzt ein Objekt der Äußeren
        Outer.Inner inner = new Outer().new Inner();

        // Statische Innere Klassen brauchen kein Objekt der Äußeren
        Outer.StaticInner sInner = new Outer.StaticInner();

    }
}

class Outer {

    class Inner {

    }

    static class StaticInner {

    }
}