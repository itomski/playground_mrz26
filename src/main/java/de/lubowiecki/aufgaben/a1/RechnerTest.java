package de.lubowiecki.aufgaben.a1;

import java.util.Scanner;

public class RechnerTest {

    public static void main(String[] args) {

        // TODO: Aufgabe 1
        // TODO: Implementiere Methoden für unterschiedliche Rechenarten im Rechner
        // TODO: Verwende einen Scanner und eine Eingabe des Users einzulesen und an den Rechner wieterzugeben

        final Scanner scanner = new Scanner(System.in);

        while(true) { // Endlosschleife
            System.out.print("A: ");
            double a = scanner.nextDouble(); // Liest einen double von der Konsole ein
            System.out.print("B: ");
            double b = scanner.nextDouble();
            System.out.print("Operation [+,-,*,/]: ");
            char op = scanner.next().trim().charAt(0); // Liest den Operator (ein Zeichen) ein

            double erg = switch(op) {
                case '+' -> Rechner.add(a, b); // Schreibweise mit -> braucht kein break
                case '*' -> Rechner.multi(a, b);
                case '-' -> Rechner.sub(a, b);
                case '/' -> Rechner.div(a, b);
                default -> Double.NaN;
            };

            System.out.println(erg);

            System.out.print("Noch mal? ");
            if(scanner.next().equals("nein")) break; // Abbruch der Endlosschleife
        }
    }
}
