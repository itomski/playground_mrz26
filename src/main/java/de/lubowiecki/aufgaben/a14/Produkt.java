package de.lubowiecki.aufgaben.a14;

import java.time.LocalDate;

public class Produkt {

    private String name;
    private String beschreibung;
    private int menge;
    private double price;
    private LocalDate imBestandSeit;

    public Produkt(String name, String beschreibung, int menge, double price) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.price = price;
        imBestandSeit = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getMenge() {
        return menge;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getImBestandSeit() {
        return imBestandSeit;
    }
}
