package de.lubowiecki.aufgaben.a8;

import java.util.Scanner;

public class Pilzsuche {

    /*
    Übung
    Schreibe ein Programm, dass das Spiel Pilzsuche realisiert.

    Beim Starten des Programms wird ein 10 Zeilen und 10 Spalten großes Spielfeld erzeugt.
    Danach werden automatisch 10 „Pilze“ positioniert. Jeder Pilz wird auf einer x/y-Koordinate platziert.
    Danach hat der Spieler 10 Versuche Zeit so viele Pilze wie möglich durch Eingabe der
    Koordinaten zu finden.

    Nach 10 Versuchen endet das Spiel und es wird die Anzahl der gefundenen Pilze angezeigt.

    Erweiterung
    Der Spieler wird gefragt, ob er noch ein weiteres Mal spielen möchte.
     */

    public static void main(String[] args) {

        //Spiel spiel = new Spiel(20, 5, 10);
        Spiel spiel = new Spiel();
        spiel.printSpielfeld();

        final Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Eingabe: ");
        }
        while(spiel.sucheAnPos(scanner.nextInt(), scanner.nextInt()));
    }
}
