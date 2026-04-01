package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class SwichTestAbJava9 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


//        Wochentag tag = Wochentag.DO;
//
//        // Mit -> wird ein break automatisch eingesetzt
//        // ist für eine Anweisung gedacht
//
//        switch(tag) {
//            case MO -> System.out.println("Montag");
//            case DI -> System.out.println("Dienstag");
//            case MI -> System.out.println("Mittwoch");
//            case SA, SO -> System.out.println("Wochenende");
//            default -> System.out.println("Ungültig");
//        }

        app: while(true) {
            System.out.print("Auswahl: ");
            String auswahl = scanner.nextLine().trim().toLowerCase();

            switch(auswahl) {
                case "new" -> newProduct();
                case "edit" -> editProduct();
                case "delete" -> deleteProduct();
                case "list" -> listProducts();
                case "exit" -> {
                    System.out.println("Programm verlassen");
                    // System.exit(0); // Beendet sofort das Programm
                    break app;
                }
                default -> System.out.println("Falsche Auswahl");
            }
        }

        System.out.println("Ciao!");
    }

    private static void newProduct() {
        System.out.println("Neues Produkt");
        //...
    }

    private static void editProduct() {
        System.out.println("Produkt bearbeiten");
        //...
    }

    private static void deleteProduct() {
        System.out.println("Produkt löschen");
        //...
    }

    private static void listProducts() {
        System.out.println("Produkte anzeigen");
        //...
    }
}
