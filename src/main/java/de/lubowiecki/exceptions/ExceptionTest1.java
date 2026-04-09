package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest1 {

    public static void main(String[] args) {


        // Unchecked: Von RuntimeException abgeleitet
        try {
            String[] strArr;

            // Exceptions die NICHT gefangen werden brechen die Abarbeitung der Methode ab!
            //strArr = new String[-15]; // NegativeArraySizeException

            strArr = new String[10];
            //strArr[10] = "Moin"; // ArrayIndexOutOfBoundsException

            //int i = Integer.parseInt("Hallo"); // NumberFormatException

            String str = null;
            System.out.println(str.toLowerCase()); // NullPointerException
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e) {
            System.out.println("Eine andere Exception");
        }

        // Checked = behandeln oder deklarieren
        try {
            // Exceptionbehandlung ist PFLICHT
            var fos = new FileInputStream("data.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
    }
}
