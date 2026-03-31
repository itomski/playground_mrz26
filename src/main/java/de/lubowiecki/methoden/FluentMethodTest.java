package de.lubowiecki.methoden;

public class FluentMethodTest {

    public static void main(String[] args) {

        Summe s1 = new Summe();
        s1.add(10.20);
        s1.add(7.15);
        s1.add(8);
        double erg1 = s1.getSumme();
        System.out.println("Summe: " + erg1);

        System.out.println();

        double erg2 = new Summe().add(10.20).add(7.15).add(8).getSumme();
        System.out.println("Summe: " + erg2);

    }
}

class Summe {

    private double summe = 0;

    public Summe add(double wert) {
        summe += wert;
        return this; // this ist das Objekt auf dem gerade die add-Methode aufgerufen wird
    }

    public double getSumme() {
        return summe;
    }
}
