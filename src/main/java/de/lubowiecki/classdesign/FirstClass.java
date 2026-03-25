package de.lubowiecki.classdesign;

/**
 * @author Tomasz Lubowiecki
 * @version 1.0
 */
public class FirstClass {

    public static void main(String[] args) {

        // Person p1 = Referenz
        // new Person() = Instanzierung (Objekt landet auf dem Heap)
        Person p1 = new Person("Peter", "Parker", 25);
        System.out.println(p1.vorname + " " + p1.nachname); // Lesen

        Person p2 = new Person("Bruce", "Banner");
        System.out.println(p2.vorname + " " + p2.nachname + ", " + p2.alter); // Lesen

        Person p3 = new Person();
        System.out.println(p3.vorname + " " + p3.nachname + ", " + p3.alter); // Lesen

        //p1.nachname = "Parker"; // Schreiben
        // p1.vorname = "Peter"; // Error: Eigenschaft ist privat

        String vorname1 = "Peter";
        String nachname1 = "Parker"; // vorname1 und nachname1 bilden keine Einheit
        String[] person1 = {"Peter", "Parker"};
        System.out.println(person1[0]); // 0 gibt keine Info darüber, was sich darin befindet
        String vorname2 = "Bruce";


    }
}

// Jede Klasse erbt automatisch von der Klasse Object
class Person {

    // Instanzvariablen (nicht static)
    public String vorname;
    public String nachname;
    public int alter = 0;

// Defaultkonstruktor (fällt weg, wenn ein eigener Konstruktor definiert wird)
//    public Person() {
//        super();
//    }

    // Konstriuktor
    public Person(String v, String nachname, int alter) {
        // Parameter / Lokale Variablen leben nur so lange, bis die Methode abgearbeitet ist
        // vorname = Parameter (lokale Variable)
        // this.vorname = Instanzvariable
        vorname = v;
        this.nachname = nachname; // this ist nur nötig, wenn es eine Namenskolision gibt
        this.alter = alter;
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person() {
    }
}