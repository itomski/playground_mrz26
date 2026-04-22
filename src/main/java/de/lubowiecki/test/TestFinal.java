package de.lubowiecki.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

import static de.lubowiecki.test.Next.text;

public class TestFinal {

    public static void main(String[] args) {

        int[][] arr1 = new int[3][2]; // {{0,0},{4,0},{0,0}}
        arr1[1][0] = 4;

        int[][] arr2 = new int[3][]; // {null,null,null}
        //arr2[1][0] = 4; // NullPointerException

        List<String> strList = new ArrayList<>(10);

        String[] arr3[] = new String[5][]; // {null,{null,null},null,null,null}
        arr3[1] = new String[2];

        List<Integer> zahlen = new ArrayList<>();
        //System.out.println(zahlen.get(10));

        System.out.println(Next.text);
        System.out.println(text);

        int i = 0;
        int sum = i++ + ++i;

        String out = "0";
        System.out.println(out);

        int x = 0;

        if(x == 0) {
            System.out.println("0");
        }
        else {
            if(x > 0) {
                System.out.println(">");
            }
            else {
                System.out.println("<");
            }
        }

        // IF ? THEN : ELSE
        // x == 0 ? "0" : (x > 0 ? ">" : "<")
        // x != 0 ? (x > 0 ? ">" : "<") : "0"

        System.out.println(x == 0 ? "0" : (x > 0 ? ">" : "<"));

        System.out.println(5 / 2); // int + int = int
        System.out.println(5 / 2.0); // int + double = double
        System.out.println(10 / 6); // int + int = int

        int j = 0;
        //                 0 +   1 *     3
        System.out.println(j++ + j++ * ++j);
        // j == 3


        String test = "ABC";
        switch(test) {
            case null:
                System.out.println("Moin");

            case "XYZ":
                System.out.println("ABC");

            default:
                System.out.println("Err");
        }

        String in = "abc";
        switch(in) {
            case "AAA" : System.out.println(2);
            case "ABC" : System.out.println(1);
            case "BBB" : System.out.println(3);break;
            case "" : System.out.println(4);
        }

        int[] arr = {1,2,3};
        //for (int k = 0; k < arr.length; System.out.println(arr[++k]));


        Parent p = new Child();
        try {
            p.machWas();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------");

        int i1, j1;
        int i2 = 100, j2;
        //int i3, int j3;

        int i4 = 010; // 8
        i4 = 0x1F; // 31

        int[] a4 = new int[]{1,2,3};
        //Integer[] o4 = a4; // Error: int-Array ist kein Integer-Array
        Object o5 = a4; // Ok. Array ist ein Object
        Object o6 = a4[0]; // int Autoboxing zu Integer, Integer komplex Widening zu Object
        //int i8 = ((int[])o5)[2];
        System.out.println(o5);

        Integer j5 = 100;
        System.out.println(j5.intValue());
        System.out.println(j5.doubleValue());
        //Double d5 = 200; // int Autoboxing zu Integer. Komplex Widening von Integer auf Double (Error)
        Double d5 = 200.0; // double Autoboxing zu Double

        System.out.println(((Double)(j5 + d5)).intValue());
        //System.out.println((j5 + d5).intValue()); // Error


        long l1 = 1_000_000_000; // L hier nicht nötig, primitive Widening von int auf long
        Long l2 = 10l; // L hier nötig. Zuerst Autoboxing von int auf Integer, dann komplex Widening
        Long l3 = ((Integer)10).longValue();

        // Autoboxing ggfl. komplex Widening
        Integer i5 = 10; // Autoboxing
        double d6 = i5; // Autounboxing ggfl. primitive Widening

        System.out.println((byte)99_999_990);
        System.out.println(Long.divideUnsigned(99_999_990, 256));
        System.out.println(Long.remainderUnsigned(99_999_990, 256));

        int eingabe; // Der Ort der Deklaration bestimmt den Scope einer Variable
        try {
            eingabe = Integer.parseInt("125");
        }
        catch(RuntimeException e) {
            eingabe = 0;
        }

        System.out.println(eingabe);

    }
}

class Next {

    public static String text = "Moin";

}

abstract class Parent {

    abstract public int machWas() throws IOException;

}

class Child extends Parent {

    // Beim Interface sind alle Member public!!!!
    // Alle Attruibute im Interface sind public static final

    @Override
    public int machWas() { // Beim Überschreiben: Gleiche Exception, Kindklasse der Org-Exception, keine Exception!
        return 0;
    }
}


