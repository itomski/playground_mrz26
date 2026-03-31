package de.lubowiecki.methoden;

import java.util.Random;

public class Hero {

    private static final Random RAND = new Random();

    private static final String[] VORNAMEN = {"Aelion", "Lyrielle", "Tharion", "Elowen", "Kaelith", "Vaelis", "Nymera", "Draven", "Sylvaris", "Zephyra"};
    private static final String[] NACHNAMEN = {"Schattenklinge", "Mondläufer", "Sturmherz", "Nachtflamme", "Silberhain", "Drachenruf", "Frostwind", "Rabenfels", "Sternensang", "Eisenfluch"};

    private final String vorname;

    private final String nachname;

    private Hero(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public static Hero create() {
        var vIdx = RAND.nextInt(VORNAMEN.length);
        var nIdx = RAND.nextInt(NACHNAMEN.length);
        return new Hero(VORNAMEN[vIdx], NACHNAMEN[nIdx]);
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        return new StringBuilder("Hero{")
                .append("vorname='").append(vorname).append('\'')
                .append(", nachname='").append(nachname).append('\'')
                .append('}')
                .toString();
    }
}
