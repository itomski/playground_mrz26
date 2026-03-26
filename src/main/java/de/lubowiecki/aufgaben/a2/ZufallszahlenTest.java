package de.lubowiecki.aufgaben.a2;

public class ZufallszahlenTest {

    // TODO: Schreibe ein Programm, dass beim Aufruf der Methode roll Zufallszahlen zwischen 1 und 6 zurückgibt
    // TODO: Siehe Math.random() oder Random-Klasse

    public static void main(String[] args) {

//        for (int i = 0; i < 50; i++) {
//            System.out.print(DiceCup.roll() + ", ");
//        }

        for (int i : DiceCup.roll(50)) {
            System.out.print(i + ", ");
        }
    }
}
