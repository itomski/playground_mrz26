package de.lubowiecki.aufgaben.a11;

import java.util.Arrays;
import java.util.Scanner;

public class RobotTest {

    /*
    Übung Robot

    Schreibe ein Konsolen-Programm zur Simulation eines Roboters.
    Der Roboter soll auf einem Spielfeld von 10 x 10 Feldern frei bewegt werden können.

    Das Spielfeld inkl. Der aktuellen Position des Roboters soll nach jeder Bewegung angezeigt
    werden.

    Die Bewegung soll durch eine Zeichenkette von Richtungen vorgegeben werden können.

    Beispiele:
    >>>r>>> könnte heißen 3 Felder vorwärts, Drehung nach Rechts und wieder 3 Felder
    vorwärts.

    >>L>>L<< könnte heißen 2 Felder vorwärts, Drehung nach Links, 2 Felder vorwärts, Drehung
    nach Links, 2 Felder rückwärts.

    Freie Felder können z.B. durch X angezeigt werden und die Position des Roboters durch ein @.
    Nach jeder Eingabe wird der Roboter bewegt und das Spielfeld angezeigt.

    Vereinfachung:
    Bewegung wird durch Ruichtungsangabe gesteuert z.B. RRUURLO (rechts, rechts, unter, unter, rechts, links, oben)
     */

//    private static final String KEYS = "\n***********************************\n" +
//                                       "\tL = Links \n" +
//                                       "\tR = Rechts \n" +
//                                       "\tU = Unten \n" +
//                                       "\tO = Oben \n" +
//                                       "\tQ = Beenden \n" +
//                                       "***********************************\n";

    private static final String KEYS = """
                                        \n***********************************
                                        \tL = Links
                                        \tR = Rechts
                                        \tU = Unten
                                        \tÜ = Unten/Rechts
                                        \tO = Oben
                                        \tQ = Beenden
                                        ***********************************\n
                                        """;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Roboter bot = new Roboter();

        char[][] spielfeld = new char[10][10];
        initSpielfeld(spielfeld);
        printSpielfeld(spielfeld, bot);

        app: while(true) {
            System.out.println(KEYS);

            System.out.print("Eingabe: ");
            String eingabe = scanner.nextLine().trim().toUpperCase();

            eingabe = eingabe.replace("Ü", "UR");

            for(int i = 0; i < eingabe.length(); i++) {
                switch(eingabe.charAt(i)) {
                    case 'R' -> bot.moveRight();
                    case 'L' -> bot.moveLeft();
                    case 'O' -> bot.moveUp();
                    case 'U' -> bot.moveDown();
                    case 'Q' -> {
                        System.out.println("Ende");
                        break app;
                    }
                    default -> System.out.println("...");
                }
            }

//            char[] arr = new char[eingabe.length()];
//            eingabe.getChars(0, eingabe.length(), arr, 0);
//
//            for(char bewegung : arr) {
//                switch(bewegung) {
//                    case 'R' -> bot.moveRight();
//                    case 'L' -> bot.moveLeft();
//                    case 'O' -> bot.moveUp();
//                    case 'U' -> bot.moveDown();
//                    case 'Q' -> {
//                        System.out.println("Ende");
//                        break app;
//                    }
//                    default -> System.out.println("...");
//                }
//            }

//            for(String bewegung : eingabe.split("")) {
//                switch(bewegung) {
//                    case "R" -> bot.moveRight();
//                    case "L" -> bot.moveLeft();
//                    case "O" -> bot.moveUp();
//                    case "U" -> bot.moveDown();
//                    case "Q" -> {
//                        System.out.println("Ende");
//                        break app;
//                    }
//                    default -> System.out.println("...");
//                }
//            }
            printSpielfeld(spielfeld, bot);
        }
    }

    private static void printSpielfeld(char[][] spielfeld, Roboter bot) {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if(bot.getPos().x == i && bot.getPos().y == j) {
                    System.out.print('@' + " ");
                }
                else {
                    System.out.print(spielfeld[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void initSpielfeld(char[][] spielfeld) {
        for(char[] zeile : spielfeld) {
            Arrays.fill(zeile, 'x');
        }
    }
}
