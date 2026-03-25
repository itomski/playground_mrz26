package de.lubowiecki.classdesign;

//import java.time.LocalDate;

import java.util.Date;
//import java.sql.Date; // Error: Klasse mit gleichen Namen ist bereits importiert

/**
 * @author Tomasz Lubowiecki
 * @version 1.0
 */
public class FirstClass {

    public static void main(String[] args) {


//        Date d1 = new Date(); // über den import vorgestellt
//        java.sql.Date d2 = new java.sql.Date(System.currentTimeMillis()); // fully qualified names

        // Person p1 = Referenz
        // new Person() = Instanzierung (Objekt landet auf dem Heap)
        Person p1 = new Person("Peter", "Parker", java.time.LocalDate.of(2000, 4, 15));
        System.out.println(p1.vorname + " " + p1.nachname + ", " + p1.getAlter()); // Lesen

        Person p2 = new Person("Bruce", "Banner");
        System.out.println(p2.vorname + " " + p2.nachname + ", " + p2.geburtsdatum); // Lesen

        Person p3 = new Person();
        System.out.println(p3.vorname + " " + p3.nachname + ", " + p3.getAlter()); // Lesen

        //p1.nachname = "Parker"; // Schreiben
        // p1.vorname = "Peter"; // Error: Eigenschaft ist privat

        String vorname1 = "Peter";
        String nachname1 = "Parker"; // vorname1 und nachname1 bilden keine Einheit
        String[] person1 = {"Peter", "Parker"};
        System.out.println(person1[0]); // 0 gibt keine Info darüber, was sich darin befindet
        String vorname2 = "Bruce";

        System.out.println(p1); // toString wird automatisch aufgerufen
    }
}