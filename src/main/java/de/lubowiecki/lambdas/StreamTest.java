package de.lubowiecki.lambdas;

import de.lubowiecki.collections.Person;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    // Streams sind nicht prüfungsrelevant

    public static void main(String[] args) {
        List<String> namen = new ArrayList<>(Arrays.asList("Peter", "Bruce", "Carol", "Natasha", "Scott", "Steve"));

        // Function<T, R>
        // R apply(T t)
        Function<String, Person> func = e -> new Person(e, "Mustermann", 0);

        UnaryOperator<String> uo = e -> e.toUpperCase(); // Wie Function aber Eingang und Rückgabe haben den gleich Typ

        // Predicate<T>
        // boolean test(T t)
        Predicate<String> pred = e -> !e.startsWith("N");

        // Consumer<T>
        // void accept(T t)
        Consumer<Person> cons = p -> System.out.println(p.getVorname() + " " + p.getNachname().charAt(0) + ".");

        namen.stream()
                .filter(pred)
                .map(func) // Function<String, Double>
                //.forEach(System.out::println);
                .forEach(cons);


        // Supplier<T>
        // T get()

        final String[] VORNAMEN = {"Peter", "Bruce", "Carol", "Nic", "Ed", "Marion"};
        final String[] NACHNAMEN = {"Petersen", "Bruckowski", "Carlinski", "Nicow", "Edson", "Macron"};
        final Random RAND = new Random();

        Supplier<Person> personFactory = () -> new Person(VORNAMEN[RAND.nextInt(6)], NACHNAMEN[RAND.nextInt(6)], 0);

        System.out.println();

        Person p = personFactory.get();
        System.out.println(p);
        p = personFactory.get();
        System.out.println(p);
        p = personFactory.get();
        System.out.println(p);

        List<Person> personen = Stream.generate(personFactory)
                                    .limit(100)
                                    .sorted()
                                    //.forEach(e -> System.out.println(e));
                                    .collect(Collectors.toList());

        System.out.println(personen);

        // BiFunction<T, U, R>
        BiFunction<Double, Double, Double> add1 = (a, b) -> a + b;
        BinaryOperator<Double> add2 = (a, b) -> a + b; // Vereinfachung, alles hat den gleich Typ
        System.out.println(add1.apply(10.5, 20.7));

    }
}
