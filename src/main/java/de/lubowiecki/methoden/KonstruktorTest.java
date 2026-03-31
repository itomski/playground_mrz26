package de.lubowiecki.methoden;

import java.time.LocalDate;

public class KonstruktorTest {

    public static void main(String[] args) {

        LocalDate heute = LocalDate.now();

        // Hero h = new Hero("Peter", "Parker"); // Error: Konstruktor ist privat

        Hero h = Hero.create(); // statische Factory-Methode wird verwendet, um Hero-Objekte zu erzeugen
        System.out.println(h.getVorname() + " " + h.getNachname());
        h = Hero.create();
        System.out.println(h.getVorname() + " " + h.getNachname());
        h = Hero.create();
        System.out.println(h.getVorname() + " " + h.getNachname());
        h = Hero.create();
        System.out.println(h.getVorname() + " " + h.getNachname());
        h = Hero.create();
        System.out.println(h.getVorname() + " " + h.getNachname());

        // Math hat einen privaten Konstruktor
        // Arrays auch

    }
}
