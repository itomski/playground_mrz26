package de.lubowiecki.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuildInInterfaceTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(Arrays.asList("Peter", "Bruce", "Carol", "Natasha", "Scott", "Steve"));

        // List.of ist in Java 8 noch nicht verfügbar
        // List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha", "Scott", "Steve"));

        // void	accept(T t)
        //namen.forEach(s -> System.out.println(s.toUpperCase()));
        //namen.forEach(s -> {});

        Consumer<String> cons1 = e -> System.out.print(e + "...");
        Consumer<String> cons2 = e -> System.out.print("..." + e);
        cons1.andThen(cons2).accept("Das ist mein Text");

        // boolean test(T t)
        Predicate<String> startetMitS = s -> s.toLowerCase().startsWith("s");
        Predicate<String> endetMitR = s -> s.toLowerCase().endsWith("r");
        Predicate<String> endetMitE = s -> s.toLowerCase().endsWith("e");

        System.out.println();

        System.out.println(startetMitS.test("Peter"));
        System.out.println(startetMitS.test("Silke"));

        System.out.println(namen);
        //namen.removeIf(startetMitS);
        // namen.removeIf(endetMitE.negate()); // Dreht die Bedingung um
        //namen.removeIf(startetMitS.and(endetMitE)); // Startet mit s und endet mit e
        namen.removeIf(startetMitS.or(endetMitE)); // Startet mit s oder endet mit e
        System.out.println(namen);
    }
}
