package de.lubowiecki.classdesign;

//import java.time.LocalDate;
//import java.time.Year;
import java.time.*;

// Jede Klasse erbt automatisch von der Klasse Object
public class Person {

    // Instanzvariablen (nicht static)
    public String vorname;
    public String nachname;
    public LocalDate geburtsdatum;

// Defaultkonstruktor (fällt weg, wenn ein eigener Konstruktor definiert wird)
//    public Person() {
//        super();
//    }

    // Konstruktor
    public Person(String v, String nachname, LocalDate geburtsdatum) {
        // Parameter / Lokale Variablen leben nur so lange, bis die Methode abgearbeitet ist
        // vorname = Parameter (lokale Variable)
        // this.vorname = Instanzvariable
        vorname = v;
        this.nachname = nachname; // this ist nur nötig, wenn es eine Namenskolision gibt
        this.geburtsdatum = geburtsdatum;
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person() {
    }

    public int getAlter() {
        if(geburtsdatum != null)
            return Year.now().getValue() - geburtsdatum.getYear();
        else
            return 0;
    }
}