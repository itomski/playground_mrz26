package de.lubowiecki.aufgaben.a4;

import java.util.Scanner;

public class RechnerTest {

    public static void main(String[] args) {

        /*
        Erweitere den Rechner-Klasse um ein Protokoll.
        Nach Ausführung jeder Operation soll ein Eintrag in das Protokoll erfolgen
        Bei: a = 10, b = 20, OP: +
        Eintrag in Protokoll: 10 + 20 = 30 \n

        Schreibe eine Methode über die das Protokoll angezeigt werden kann.

        Entscheidet, ob das Protokoll eine Instanz- oder eine Klassenvariable sein MUSS.

        Probiert es aus :-)
        */

        final Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("A: ");
            double a = scanner.nextDouble();
            System.out.print("B: ");
            double b = scanner.nextDouble();
            System.out.print("Operation [+,-,*,/]: ");
            char op = scanner.next().trim().charAt(0);

            double erg = switch(op) {
                case '+' -> Rechner.add(a, b);
                case '*' -> Rechner.multi(a, b);
                case '-' -> Rechner.sub(a, b);
                case '/' -> Rechner.div(a, b);
                default -> Double.NaN;
            };

            System.out.println(erg);

            System.out.print("Noch mal? ");
            if(scanner.next().equals("nein")) break;
        }

        System.out.println(Rechner.getProtokoll());
    }
}
