package de.lubowiecki.variablen;

import java.time.LocalTime;
import java.util.Arrays;

public class KonstentenTest2 {

    // Instanzkonstante
    private final String text = "...";
    // Instanzkonstanten MÜSSEN spätestens im Konstruktor ihren Wert bekommen!

    // Klassenkonstante
    private static final String andererText;
    // Klassenkonstanten müssen spätestens im statischen Initializer zugewiesen werden

    // statischer Initializer
    static {
        System.out.println("INIT: START");
        if(LocalTime.now().getHour() > 11) {
            andererText = "ABC";
        }
        else {
            andererText = "BCD";
        }
        System.out.println("INIT: ENDE");
    }

    public static void main(String[] args) {

        System.out.println("MAIN: START");

        final int i = 10;
        // i = 20; // Error

        final int[] arr = new int[5];
        // arr = new int[10]; // Error: Änderung der Referenz ist nicht erlaubt!
        System.out.println(Arrays.toString(arr));
        arr[0] = 100; // Zustand des Arrays darf sich verändern
        arr[3] = 25;
        arr[3] = 37;
        System.out.println(Arrays.toString(arr));

        System.out.println("MAIN: ENDE");
    }

}
