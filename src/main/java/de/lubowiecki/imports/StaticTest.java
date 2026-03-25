package de.lubowiecki.imports;

// Statische imports importieren das statische Inventar (Eigenschaften oder Methoden) einer anderen Klasse
import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static de.lubowiecki.imports.Wochentag.*;

public class StaticTest {

    public static void main(String[] args) {

        out.println(PI);
        Wochentag tag1 = Wochentag.SA;
        Wochentag tag2 = SA;

        out.println(pow(10, 2));
    }
}
