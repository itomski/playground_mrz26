package de.lubowiecki.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ExceptionTest {

    // RuntimeException (Unchecked Exceptions)

        // IndexOutOfBoundsException
                // ArrayIndexOutOfBoundsException
                // StringIndexOutOfBoundsException
        // NullPointerException
        // NegativeArraySizeException
        // ClassCastException
        // ArithmeticException
        // IllegalArgumentException
            // NumberFormatException

    public static void main(String[] args) {

        //List<String> liste = new ArrayList<>();
        List<String> liste = null;
        try {
            System.out.println(selectFirst(liste));
        }
        catch (RuntimeException e) {
            System.out.println("Leer 2");
        }
    }

    private static String selectFirst(List<String> liste) {

        // RuntimeExceptions bewegen sich automatisch zum Aufrufer, bis sie behandelt werden
        // oder die main-Methode abbrechen

        // Eine behandelte Exception wird NICHT weiter an Aufrufer gegeben

        try {
            return liste.getFirst();
        }
        catch(NoSuchElementException e) {
            return "Leer 1";
        }
    }
}
