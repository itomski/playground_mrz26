package de.lubowiecki.api;

public class StringTest3 {

    public static void main(String[] args) {

        String s1 = "Moin"; // Landet auf dem Pool
        String s2 = new String("Moin"); // Landet nicht auf dem Pool
        String s3 = new String("moin"); // Landet nicht auf dem Pool

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println(s1.toUpperCase().equals(s3.toUpperCase()));

        s2 = s2.intern(); // Referenz wird auf das Objekt im Pool umgeleitet (wenn vorhanden)
        System.out.println(s1 == s2);

        System.out.println();

        //s2 = s2.toUpperCase();
        //System.out.println(s2);
        System.out.println(s2.toLowerCase());
        System.out.println(s2);
    }
}
