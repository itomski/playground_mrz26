package de.lubowiecki.aufgaben.a16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AufgabeExceptions {

    /*
    Schreibe ein Programm, dass den User bittet eine Zahl einzugeben.
    Wenn die Eingabe richtig erfolgt, wird die Zahl ausgegeben
    Ansonsten bekommt der User einen Hinweis und wird wieder nach einer Zahl gefragt
    Benutze Exceptions
    */

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int eingabe = intInput("Zahleingabe");
        System.out.println("Zahl: " + eingabe);
    }

    private static int intInput(String label) {
        while(true) {
            System.out.print(label + ": ");
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Falsche Eingabe!");
                scanner.nextLine(); // fix
            }
        }
    }
}
