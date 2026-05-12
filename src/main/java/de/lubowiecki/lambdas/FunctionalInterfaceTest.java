package de.lubowiecki.lambdas;

import java.util.function.Predicate;

public class FunctionalInterfaceTest {

    // Jedes Lambda basiert auf einem FunctionalInterface
    // FunctionalInterface = ein Interface mit nur einer einzigen abstrakten Methode
    // Es kann noch statische und default Methoden enthalten
    // Der Lambda-Ausdruck ist die Implementierung der abstrakten Methode

    public static void main(String[] args) {

        System.exit(0); //Beendet das Programm sofort

// boolean moveTo(int x, int y);
        Moveable m1 = (a, b) -> a == b;

        Moveable m2 = (a, b) -> {
            int x = a + b;
            return x < 100; // return wird benötigt
        };

// Bei einer einzigen Anweisung liefert diese automatisch den Rückgabewert (Ausnahme void)
        Moveable m3 = (a, b) -> true; // Wert ist automatisch der Rückgabewert

        var i = 100;

// boolean test(T t);
        Predicate<Integer> kleinerAls100 = a -> a < 100;
        kleinerAls100 = (a) -> a < 100;
        kleinerAls100 = (Integer a) -> a < 100;
        boolean ok = check(kleinerAls100, 10, 15, 22, 89, 120, 42, 70);
        System.out.println(ok);

        System.out.println();

        ok = check(z -> z < 200, 10, 15, 22, 89, 120, 42, 70);
        System.out.println(ok);

// Verwendet man für den Parameter einen Typ, dann MUSS dieser zu der abstrakten Methode passen
        Predicate<Double> kleinerAls100AsDouble = (Double a) -> a < 100;

    }

    static boolean check(Predicate<Integer> pred, int... zahlen) {

        // Alle Zahlen werden geüprüft
        for (int zahl : zahlen) {
            if (!pred.test(zahl))
                return false;
        }
        return true;
    }
}

@FunctionalInterface // Prüft die Voraussetzungen für ein Functional-Interface
interface Moveable {

    boolean moveTo(int x, int y);

}