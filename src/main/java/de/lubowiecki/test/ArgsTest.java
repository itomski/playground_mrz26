package de.lubowiecki.test;

import java.util.Arrays;

public class ArgsTest {
    public static void main(String[] args) {// new String[]{}

        /* Werden keine Programm-Argumente übergeben ist das args ein leeres Array */

        //args = new String[3]; // {null, null, null}
        //args = null; // Das JVM Array wird mit null überschrieben
        System.out.println(args == null);//  {}
        System.out.println(args[0] == null);
        //System.out.println(args[0].equals("null"));
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        int[][] arr = new int[2][]; // {null, null}
        String[] arr2 = new String[3]; // {null, null, null}
        int[] arr3 = new int[3]; // {0, 0, 0}


        try {
            System.out.println("Moin");
        }
        catch(Exception e) {
            System.out.println("A");
        }
//        catch(RuntimeException e) {
//            System.out.println("B");
//        }

        // Ganzzahlen-Literale sind per default ints
        // Fließkommazahlen-Literale sind per default double

        byte b = 100; // Ganzzahlen-Literal erlaubt, wenn im Wertebereich von byte
        short s = 100; // Ganzzahlen-Literal erlaubt, wenn im Wertebereich von short
        char c = 100; // Ganzzahlen-Literal erlaubt, wenn im Wertebereich von char

    }

    int i = 10;

    void machWas(int i) {
        //int i = 20; // Error: Redeklaration
        i = 20; // Ok: Parameter-Variable wird überschrieben
    }

}
