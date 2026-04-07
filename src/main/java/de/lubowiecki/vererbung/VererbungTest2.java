package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class VererbungTest2 {

    public static void main(String[] args) {

        Mensch m1 = new Mensch("Peter", "Parker");
        // Nicht private Methoden werden vererbt
        m1.atmen();
        m1.kommunizieren();
        // Nicht private Eigenschaften werden vererbt
        System.out.println(m1.xPos + " " + m1.yPos);
        System.out.println(m1.getVorname() + " " + m1.getNachname()); // Zugriff auf alle Methoden von Mensch

        System.out.println();
        Tier t1 = new Tier("Leo");
        t1.atmen();
        t1.kommunizieren();
        System.out.println(t1.getName());

        System.out.println();
        Lebewesen l1 = new Lebewesen();
        l1.atmen();
        l1.fortbewegen();
        // Die Referenz entscheidet, welche Methoden sichtbar sind!!!
        // Ist eine Methode im Referenztyp nicht enthalten, dar sie nicht aufgerufen werden
        System.out.println(l1); // Nur Methoden aus dem Lebewesen sind über l1 verfügbar

        System.out.println();
        // Mensch IS-A Lebewesen
        Lebewesen l2 = new Mensch("Bruce", "Banner");
        // Referenztyp: Lebewesen
        // Objekttyp: Mensch
        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        l2.fortbewegen();
        l2.kommunizieren();

        System.out.println();
        l2 = new Tier("Pepe");
        l2.fortbewegen();
        l2.kommunizieren();

        System.out.println("----------------------------");
        machWas(m1);
        machWas(t1);
        machWas(new Hund("Hansi")); // Hund IS-A Tier IS-A Lebewesen

        System.out.println("----------------------------");

        // Referenztyp: Tier
        // Objekttyp: Tier
        Tier t2 = new Tier("Fuffi");

        // Referenztyp: Lebewesen
        // Objekttyp: Tier
        // Objekttyp verändert sich nicht
        Lebewesen l3 = t2;

        // Refernztyp: List
        // Objekttyp: ArrayList
        List<String> list = new ArrayList<>();

        // Hund IS-NOT Mensch!!!!
        // Mensch m3 = new Hund("Klaus"); // Error

        System.out.println();

        Mensch m4 = new Mensch("Carol", "Denvers");

        // Upcasting
        Lebewesen l4 = m4; // Mensch IS-A Lebewesen

        // Downcasting
        // l4 könnte ein Tier sein
        // Zur Laufzeit wird festgestellt, dass l4 ein Mensch ist, daher ClassCastException
        // Tier t4 = (Tier)l4; // Exception: Nicht jedes Lebewesen ist ein Tier


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        Hund h1 = new Hund("Nic");

    }

    public static void machWas(Lebewesen l) {
        System.out.println("machWas");
        // Referenz prüft, ob eine Methode mit gleicher Signatur verfügbar ist
        l.fortbewegen();
    }
}

class Lebewesen {

    public int xPos;
    public int yPos;

    public void atmen() {
        System.out.println(getClass().getSimpleName() + ": atmet");
    }

    public void fortbewegen() {
        System.out.println(getClass().getSimpleName() + ": bewegt sich fort");
    }

    public void kommunizieren() {
        System.out.println(getClass().getSimpleName() + ": kommuniziert");
    }
}

// Lebewesen -> Elternklasse/Superklasse
// Mensch -> Kindklasse/Subklasse
class Mensch extends Lebewesen {

    private String vorname;
    private String nachname;

    public Mensch(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}

class Tier extends Lebewesen {

    private String name;

    int alter = 10;

    public Tier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Hund extends Tier {

    int alter = 20; // Eigenschaft wird überlagert

    // Konstruktoren werden NICHT vererbt
    public Hund(String name) {
        super(name);
        // fortbewegen(); // this wird automatisch davor gesetzt
        this.fortbewegen(); // Aufruf der eigenen Methode
        super.fortbewegen(); // Aufruf der Methode aus der Elternklasse
        System.out.println(alter); // Eigene Eigenschaft verwendet
        System.out.println(super.alter); // die Eigenschaft aus der Superklasse verwendet
    }

    // Überschreiben = eine geerbte Methode wird durch eine andere Version ersetzt
    @Override
    public void fortbewegen() {
        System.out.println(getName() + " rennt durch die Gegend.");
    }
}