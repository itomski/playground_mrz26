package de.lubowiecki.variablen;

import java.util.Scanner;

public class EingabeEinlesen {

    public static void main(String[] args) {

        // System.in = Konsoleneingabe
        Scanner scanner = new Scanner(System.in);

        // Konsoleneingabe wird eingelesen und in eine Variable abgelegt
        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine(); // Wartet hier, bis die Eingabe erfolgt ist
        System.out.println(eingabe);

        System.out.print("Zahl: ");
        int zahl = scanner.nextInt();
        System.out.println(zahl * 2);

        System.out.print("Zahl: ");
        double andereZahl = scanner.nextDouble();
        System.out.println(andereZahl * 2);

        scanner.nextLine(); // fix

        System.out.print("Eingabe: ");
        eingabe = scanner.nextLine();
        System.out.println(eingabe);

    }
}
