package de.lubowiecki.api;

import java.util.Arrays;

/**
 * @author Tomasz Lubowiecki
 */
public class StringTest4 {

    // KEIN Konstruktor!!!!!
    public void StringTest4() {
        System.out.println("Test");
    }

    public StringTest4() {
        System.out.println("Const");
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        String s1 = "123";

        String s2 = sb1.toString();
        String s3 = sb2.toString();
        System.out.println(s2.equals(s3));

        System.out.println(sb1.equals(sb2)); // equals-Methode ist im StringBuilder NICHT!!!! überschrieben

        char c = 65_535;
        System.out.println(c);

        float f1 = 1.5f;
        float f2 = 1f;
        float f3 = .5f;
        float f4 = 1.f;

        System.out.println(10/0.0); // Infinity
        System.out.println(10.0/0);
        System.out.println(10.0/0.0);
        System.out.println(0.0/0.0); // NaN
        //System.out.println(10/0); // Ganzzahlen: ArithmeticException

        StringTest4 st4 = new StringTest4(); // Default-Konstruktor
        st4.StringTest4(); // Methode

        String s = "Moin";
        s = s.concat(" Moin");
        System.out.println(s);

        System.out.println("0123456789".substring(4));

        System.out.println(Arrays.toString(new Integer[]{1,2,3}));

        final int[] arr = new int[4];
        //arr = new int[4]; // referenz ist final = Neuzuweisung nicht möglich

        int[] arr3 = {1,2,3,4}; // Nur bei gleichzeitiger Variablendeklaration erlaubt
        //arr3 = {1,2,3,4}; // Error
        arr3 = new int[]{1,2,3,4}; // Ok - Immer erlaubt

        int[] arr4 = null;
        //Arrays.sort(arr4);
        //Arrays.sort(null);

        int[][] arr5 = new int[2][]; // {null, null}
        //Arrays.sort(arr5[1]); // NullPointerException

        Object[] arr6 = new Integer[10];
        //arr6[0] = "Moin"; // ArrayStoreException
        arr6[0] = 123; // Ok

        int a = 5;
        int b = 10;
        char ch = 20;
        System.out.println(a + ch + b); // char wird zum Rechnen in int umgewandelt
        System.out.println(a + b + ch);

    }
}
