package de.lubowiecki.kontrollstrukturen;

public class SwitchProbleme {

    public static void main(String[] args) {

        byte auswahl = 10;

        // Kompiler MUSS prüfen können, ob jeder Case einzigartig ist

        final byte a = 10; // Kompiletimekonstante

        final byte b;
        b = 10; // Runtimekonstante

        switch(auswahl) { //  Eingangsvariable definiert den gültigen Wertbereich
            case 0:
                System.out.println("Produktübersicht");
                break;
//            case 10 + b: // Error: In cases sind NUR Kompiletimekonstanten erlaubt
//                System.out.println("Neues Produkt");
//                break;

            case 110 - a:
                System.out.println("Produkt ändern");
                break;
            case a - 1: // Kein gültiger byte Wert
                System.out.println("Programm wird verlassen");
                break;
            default:
                System.out.println("Ungültige Auswahl");
        }


    }
}
