package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class Basics {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String KEY_NEXT_QUESTION = "Weiter? ";


    public static void main(String[] args) {

//        boolean exit = false;
//        while(!exit) { // wiederholen solange exit false ist
//            System.out.print("Eingabe: ");
//            String eingabe = scanner.next();
//            System.out.println("Deine Eingabe: " + eingabe);
//
//            System.out.print("Weiter? ");
//            if(scanner.next().trim().toLowerCase().equals("nein")) {
//                exit = true;
//            }
//        }

        // app = label
        app: while(true) {
            inputText();

            if(checkExit()) {
                break app; // breche schleife mit label app ab
            }
        }

        System.out.println("Ende");
    }

    private static void inputText() {
        System.out.print("Eingabe: ");
        String eingabe = scanner.next();
        System.out.println("Deine Eingabe: " + eingabe);
    }

    private static boolean checkExit() {
        System.out.print(KEY_NEXT_QUESTION);
        return scanner.next().trim().toLowerCase().equals("nein");
    }
}
