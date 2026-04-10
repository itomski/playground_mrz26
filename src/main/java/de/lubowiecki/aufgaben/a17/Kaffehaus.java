package de.lubowiecki.aufgaben.a17;

import java.util.Scanner;

public class Kaffehaus {

    /*
    Aufgabe
    Schreibe ein Programm für eine Kaffeemaschine.
    Über die Konsole kann ein Produkt ausgewählt werden.
    Daraufhin produziert das Programm ein Objekt einer Kindklasse der Klasse Kaffeeprodukt.

    Für den Kaffee soll ausreichend Geld eingeworfen werden.
    Das passiert über eine Methode der Kaffeemaschine, wo man als Parameter einen double übergibt.
    Sollte dies nicht der Falls sein, wird eine Exception geworfen.

    Jeder Kaffee verbraucht Wasser, Milch und Kaffee.
    Ist Wasser, Milch oder Kaffee verbraucht, wird eine Exception geworfen.
     */

    public static void main(String[] args) {

        final Kaffeautomat automat = new Kaffeautomat();

        final Scanner scanner = new Scanner(System.in);

        Kaffeeprodukt produkt = null;

        app: while(true) {
            System.out.print("Auswahl: ");
            switch(scanner.nextInt()) {
                case 1 -> {
                    produkt = new Espresso();
                    break app;
                }
                case 2 -> {
                    produkt = new Cappuccino();
                    break app;
                }
                case 3 -> {
                    produkt = new Americano();
                    break app;
                }
                case 4 -> automat.einwurf(1);
                default -> System.out.println("Falsche Auswahl");
            }
        }
        try {
            automat.zubereiten(produkt);
            System.out.println(produkt.getBezeichnung() + " wurde erstellt");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if (automat.istGeldVorhanden()) {
            System.out.println("Dein Rückgeld: " + automat.geldAusgeben());
        }
    }
}
