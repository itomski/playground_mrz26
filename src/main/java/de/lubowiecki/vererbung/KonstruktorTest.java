package de.lubowiecki.vererbung;

public class KonstruktorTest {

    public static void main(String[] args) {

        new BB();
        System.out.println();
        new BB(true);

        // Von Object werden Methoden geerbt
        BB b1 = new BB();
        b1 = new BB(true);



    }
}

class BA {
    public BA(int i) {
        this(); // hier wird super() nicht benutzt
        System.out.println("BA 1");
    }

    public BA() {
        // wenn nichts drin steht wird automatisch super() verwendet
        System.out.println("BA 2");
    }
}

class BB extends BA {

// Default-Konstruktor
    public BB() {
        super(); // super() oder this() (wenn vorhanden) MUSS die erste Zeile im Konstruktor sein
        System.out.println("BB 1");
    }

    public BB(boolean a) {
        super(100); // Aufruf MUSS einen Parameter entgegennehmen
        System.out.println("BB 2");
    }
}
