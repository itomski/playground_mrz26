package de.lubowiecki.variablen;

public class ZahlenSysteme {

    public static void main(String[] args) {

        int i = 017; // Oktal
        System.out.println(i);
        i = 0b00010001;
        System.out.println(i);
        i = 0x1f;
        System.out.println(i);

        System.out.println(Integer.toOctalString(15));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.toHexString(15));
        System.out.println();
        System.out.println(Double.toHexString(15.5));


//        System.in
//        System.out
//        System.err

        System.out.printf("%d \n", 21);
        System.out.printf("%.2f \n", 21.123);
        System.out.printf("%f \n", 21.123);
        System.out.printf("%x \n", 21);
        System.err.printf("%o \n", 21);

        //System.out.printf("Das ist %s und er wohnt in %s \n", "Peter", "Hamburg");

    }
}
