package de.lubowiecki.kontrollstrukturen;

public class BreakContinueTest {

    public static void main(String[] args) {



        while(true) { // Endlosschleife
            int zufall = (int)(Math.random() * 100) + 1;
            System.out.println(zufall);
            if(zufall == 100) break; // Bricht die Schleife ab
        }

        System.out.println();

        while(true) { // Endlosschleife
            int zufall = (int)(Math.random() * 100) + 1;
            if(zufall % 2 == 1) continue; // Springt zum nächsten durchlauf der Schleife

            System.out.println(zufall);
            if(zufall == 100) break; // Bricht die Schleife ab
        }

        System.out.println();

        for(int i = 0; i < 100; i++) {
            if(i == 10 || i == 50) continue; // 10 und 50 werden übersprungen

            System.out.println(i);
        }

        System.out.println();

        // label
        outer: for (int i = 0; i < 1000; i++) {
            inner: for (int j = 0; j < 1000; j++) {

                if(i + j == 1500) break outer; // bricht die äußere Schleife ab
                if(i + j == 1000) continue inner; // springt zum nächsten durchlauf der inneren
                // if(i + j == 1500) break; // bricht nur die innere Schleife ab
                System.out.println(i + j);
            }
        }
    }
}
