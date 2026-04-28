package de.lubowiecki.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ExceptionTestChecked {

    // Exception: Checked-Exception
        // IOException
            // FileNotFoundException


    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();

        try {
            System.out.println(selectFirst(liste));

            // Es darf keine Checked-Exception (außer Exception selbst) gefangen werden
            // wenn sie gar nicht geworfen werden kann
            // Wird eine Exception gefangen, dann dürfen auch Blöcke für ihre Kindklassen entstehen

        }
        catch (FileNotFoundException e) {
            System.out.println("Datei Problem");
        }
        catch (IOException e) {
            System.out.println("Verarbeitungsproblem");
        }
        catch (Exception e) { // Die Exception, die geworfen wird (oder ihre Eltern-Exception) muss gefangen werden
            System.out.println("Problem");
        }
    }

    private static String selectFirst(List<String> liste) throws Exception {

        // CheckdExceptions bewegen sich NICHT automatisch zum Aufrufer.
        // Der Kompiler zwingt uns zur Behandlung (try-catch) oder Deklaration (throws an der Methodensignatur)
        // Throws zwingt den Aufrufer zur Behandlung

        try {
            return liste.getFirst();
        }
        catch(NoSuchElementException e) {
            throw new Exception(e); // Wechsel von unchecked auf checked Exception
        }
    }
}
