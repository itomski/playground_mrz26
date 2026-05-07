package de.lubowiecki.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {

        String[][] str = new String[5][]; // {null, null, null, null, null}
        str[1] = new String[2]; // {null, {null, null}, null, null, null}
        //System.out.println(str[2].length); // NullPointerException
        //str[2][1] = "5"; // NullPointerException
        str[2] = new String[3]; // {null, {null, null}, {null, null, null}, null, null}
        str[2][1] = "5"; // {null, {null, null}, {null, "5", null}, null, null}

        System.out.println(Arrays.deepToString(str));

        String[][] str2 = new String[5][];
        System.out.println(Arrays.deepEquals(str, str2));

        System.out.println();

        String[] str3 = new String[]{"A", "B", "C"};
        String[] str4 = new String[]{"A", "B", "D"};
        System.out.println(Arrays.deepEquals(str3, str4));

        System.out.println();

        int[] i1 = new int[]{1,2,3};
        int[] i2 = new int[]{4,5,6};
        //System.out.println(Arrays.deepEquals(i1, i2));
        System.out.println(Arrays.equals(i1, i2));

        int[] i3 = Arrays.copyOf(i1, 2); // Kann keiner sein als ein das Original-Array
        System.out.println(Arrays.toString(i3));


        int[] arr = {7,9,22,1,-5};
        Arrays.sort(arr); // {-5,1,7,9,22}
        System.out.println(Arrays.binarySearch(arr,-22)); // -(insertion point) - 1 oder wenn vorhanden den index


        // StringIndexOutOfBoundsException
        // System.out.println("Hallo Welt".charAt(10));

        try {
            machWas();
        }
        catch(IOException e) {
            System.out.println("IO");
        }
        catch(Exception e) {
            System.out.println("Rest");
        }
    }

    static void machWas() throws Exception {
        throw new SQLException();
        //throw new RuntimeException();
    }

}
