package de.lubowiecki.aufgaben.a17;

public abstract class Kaffeeprodukt {

    private final String bezeichnung;
    private final int kaffeeMenge;
    private final int milchMenge;
    private final int wasserMenge;
    private final double preis;

    public Kaffeeprodukt(String bezeichnung, int kaffeeMenge, int milchMenge, int wasserMenge, double preis) {
        this.bezeichnung = bezeichnung;
        this.kaffeeMenge = kaffeeMenge;
        this.milchMenge = milchMenge;
        this.wasserMenge = wasserMenge;
        this.preis = preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getKaffeeMenge() {
        return kaffeeMenge;
    }

    public int getMilchMenge() {
        return milchMenge;
    }

    public int getWasserMenge() {
        return wasserMenge;
    }

    public double getPreis() {
        return preis;
    }
}
