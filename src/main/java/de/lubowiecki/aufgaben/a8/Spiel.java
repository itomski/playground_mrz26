package de.lubowiecki.aufgaben.a8;

import java.util.Random;

public class Spiel {

    private final int ANZAHL_ZEILEN;
    private final int ANZAHL_ZELLEN;
    private final int ANZAHL_PILZE;
    private final int ANZAHL_VERSUCHE;

    private int aktuellerVersuch;

    private int pilzeGefunden;

    private Pilz[][] spielfeld;

    private static final String LEER = "\uD83D\uDFE9";

    private static final Random zufallsGenerator = new Random();

    public Spiel(int anzahlZeilen, int anzahlZellen, int anzahlPilze, int anzahlVersuche) {
        this.ANZAHL_ZEILEN = anzahlZeilen;
        this.ANZAHL_ZELLEN = anzahlZellen;
        this.ANZAHL_PILZE = anzahlPilze;
        this.ANZAHL_VERSUCHE = anzahlVersuche;
        spielfeld = new Pilz[ANZAHL_ZEILEN][ANZAHL_ZELLEN];
        setzePilze();
    }

    public Spiel() {
        this(10, 10, 10, 10);
    }

    private void setzePilze() {
        for (int i = 0; i < ANZAHL_PILZE; i++) {
            setzePilz();
        }
    }

    private void setzePilz() {
        int zeile = zufallsGenerator.nextInt(0, ANZAHL_ZEILEN);
        int zelle = zufallsGenerator.nextInt(0, ANZAHL_ZELLEN);

        int giftig = zufallsGenerator.nextInt(100);

        if(spielfeld[zeile][zelle] != null) {
            setzePilz();
        }
        else {
            spielfeld[zeile][zelle] = new Pilz(giftig % 2 == 1);
        }
    }

    public void printSpielfeld() {

        for (int i = 0; i < ANZAHL_ZEILEN; i++) {
            for (int j = 0; j < ANZAHL_ZELLEN; j++) {
                System.out.print((spielfeld[i][j] == null ? LEER : spielfeld[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public boolean sucheAnPos(int zeile, int zelle) {

        // TODO: Feste Ausgabe gegen Status-Codes austauschen

        if(ANZAHL_VERSUCHE <= aktuellerVersuch) {
            System.out.println("Alle Versuche aufgebraucht");
            return false; // Verlässt vorzeitig die Methode
        }

        Pilz position = spielfeld[zeile][zelle];
        aktuellerVersuch++;

        if(position == null) {
            System.out.println("Nichts gefunden");
        }
        else {
            if(position.isEingesammelt()) {
                System.out.println("Hast du bereits eingesammelt");
            }
            else {
                System.out.println("Gefunden");
                position.setEingesammelt(true);
                pilzeGefunden++;
            }
        }
        getStatus();
        return true;
    }

    public void getStatus() {
        System.out.println("Versuch Nr: " + aktuellerVersuch);
        System.out.println("Pilze gefunden: " + pilzeGefunden);
        System.out.println();
        System.out.println();
    }

    public void reset() {
        spielfeld = new Pilz[ANZAHL_ZEILEN][ANZAHL_ZELLEN];
        setzePilze();
        aktuellerVersuch = 0;
        pilzeGefunden = 0;
    }
}
