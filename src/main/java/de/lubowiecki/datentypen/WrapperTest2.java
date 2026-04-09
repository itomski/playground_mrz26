package de.lubowiecki.datentypen;

public class WrapperTest2 {

    public static void main(String[] args) {

        Integer i = 10; // Integer i = Integer.valueOf(10);
        System.out.println(i);
        i++; // // i = Integer.valueOf(i.intValue()++);
        System.out.println(i);

        int j = i; // int j = i.intValue();
        System.out.println(j);
        j++; // j++
        System.out.println(j);

    }
}
