package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonenListe {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Parker", 25));
        personList.add(new Person("Bruce", "Banner", 42));
        personList.add(new Person("Carol", "Danvers", 31));
        personList.add(new Person("Carol", "Ansen", 52));
        personList.add(new Person("Steve", "Rogers", 92));

        //Collections.sort(personList); // Nutzt die natürliche Reihenfolge (compareTo-Methode)

        Comparator<Person> nachVorname = Comparator.comparing(Person::getVorname);
        Comparator<Person> nachNachname = Comparator.comparing(Person::getNachname);
        Comparator<Person> nachAlter = Comparator.comparing(Person::getAlter);

        personList.sort(nachVorname.thenComparing(nachNachname).thenComparing(nachAlter));

        System.out.println(personList);

        for(Person p : personList) {
            System.out.println(p.getVorname() + " " + p.getNachname() + ", " + p.getId());
        }

    }

}
