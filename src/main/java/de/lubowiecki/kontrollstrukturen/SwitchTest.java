package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {


        // Ganzzahlen ohne long
        // char, String und ENUMs

        final Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: ");
        int auswahl = scanner.nextInt();

        switch(auswahl) {

            case 0:
                System.out.println("Produktübersicht");
                break;

            case 1:
                System.out.println("Neues Produkt");
                break;

            case 2:
                System.out.println("Produkt ändern");
                break;

            case 4:
                System.out.println("Programm wird verlassen");
                break;

            default: // Wenn kein anderer case passt. Ist optional
                System.out.println("Ungültige Auswahl");
        }

        System.out.println();

//        String tag = "DO";
//
//        switch(tag) {
//
//            case "MO":
//                System.out.println("Montag");
//
//            case "DI":
//                System.out.println("Dienstag");
//
//            case "MI":
//                System.out.println("Mittwoch");
//
//            case "DO":
//                System.out.println("Donnerstag");
//
//            case "FR":
//                System.out.println("Freitag");
//
//            case "SA":
//            case "SO":
//                System.out.println("Wochenende");
//        }

        Wochentag tag = Wochentag.DO;

        switch(tag) {

            case MO:
                System.out.println("Montag");

            case DI:
                System.out.println("Dienstag");

            case MI:
                System.out.println("Mittwoch");

            case SA:
            case SO:
                System.out.println("Wochenende");
                break;

            default:
                System.out.println("Ungültig");
        }
    }
}
