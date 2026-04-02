package de.lubowiecki.kontrollstrukturen;

public class WhileTest {

    public static void main(String[] args) {

        int i = 10;

        while(i > 0) {
            System.out.println(i--);
        }

        System.out.println();

        // Body wird mind. 1x ausgeführt
        do {
            System.out.println(i--);
        }
        while(i > 0);

        System.out.println();

//        while(j < 10) { // Error: j ist erst im Body verfügbar
//            int j = 0;
//            System.out.println(i++);
//        }
//
//        do {
//            int j = 0;
//            System.out.println(j++);
//        }
//        while(j < 10); // Error: j ist NUR im Body verfügbar

        boolean machMal = true;

        while(machMal = false) {
            System.out.println("....");
        }

        // Schreibweise hilft zu erkennen, ob es ein Vergleich oder eine Zuweisung ist
//        while(false = machMal) { // Error
//            System.out.println("....");
//        }

        while(!machMal) { // Error
            System.out.println("....");
        }

//        while(!true) { // Error
//            System.out.println("....");
//        }

//        != // Vergleichoperator
//        ! // Logisches NOT

    }
}
