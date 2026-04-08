package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class AbstractBeispiel {

    public static void main(String[] args) {

        List<Beweglich> elemente = new ArrayList<>();

        elemente.add(new Person("Peter", "Parker", 10, 15));
        elemente.add(new Lkw("HH:AB123", "Scania", "V235", "Holzkohle"));
        elemente.add(new Pkw("HB:XY345", "Ford", "Ka", 15, 22));

        for(Beweglich b : elemente) {
            b.bewegeAnPos(0, 0);
        }
    }
}

interface Beweglich {

    void bewegeAnPos(int x, int y);

}

abstract class AbstractBeweglich implements Beweglich {

    private int x;
    private int y;

    public AbstractBeweglich() {
    }

    public AbstractBeweglich(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void bewegeAnPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

abstract class AbstractFahrzeug extends AbstractBeweglich  {

    private String kennzeichen;
    private String marke;
    private String modell;

    public AbstractFahrzeug(String kennzeichen, String marke, String modell) {
        this(kennzeichen, marke, modell, 0, 0);
    }

    public AbstractFahrzeug(String kennzeichen, String marke, String modell, int x, int y) {
        super(x, y);
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }
}

class Pkw extends AbstractFahrzeug {

    private String[] insassen = new String[5];

    public Pkw(String kennzeichen, String marke, String modell) {
        super(kennzeichen, marke, modell); // Aufruf des Konstruktors der abstrakten Elternklasse
    }

    public Pkw(String kennzeichen, String marke, String modell, int x, int y) {
        super(kennzeichen, marke, modell, x, y);
    }

    public void addInsassen(String... insasse) {
        //...
    }

    public String[] getInsassen() {
        return insassen;
    }
}

class Lkw extends AbstractFahrzeug {

    private String ladung;

    public Lkw(String kennzeichen, String marke, String modell, String ladung) {
        super(kennzeichen, marke, modell);
        this.ladung = ladung;
    }

    public Lkw(String kennzeichen, String marke, String modell, String ladung, int x, int y) {
        super(kennzeichen, marke, modell, x, y);
        this.ladung = ladung;
    }

    public void setLadung(String ladung) {
        this.ladung = ladung;
    }

    public String getLadung() {
        return ladung;
    }
}

class Person extends AbstractBeweglich {

    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, int x, int y) {
        super(x, y);
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