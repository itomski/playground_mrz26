package de.lubowiecki.api;

public class StringTest2 {

    public static void main(String[] args) {

        String s1 = "Moin";
        String s2 = new String("Moin");
        System.out.println(s1 == s2); // Gleiches Objekt auf dem Heap?
        System.out.println(s1.equals(s2)); // Gleicher Inhalt?
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        s1 = "i:Das ist das Haus von Nikigraus";

        System.out.println(s1.indexOf("i"));
        System.out.println(s1.indexOf("i", 2));
        System.out.println(s1.lastIndexOf("i"));
        System.out.println(s1.startsWith("X"));
        System.out.println(s1.charAt(10));
        s1 = "\t\t\n x y z     ";
        s1 = s1.trim();
        System.out.println("|" + s1 + "|");

        System.out.println();

        String erg = String.join(", ", "Peter", "Bruce", "Carol", "Natasha", "Scott");
        System.out.println(erg);

        erg = String.format("Preis: %.2f €", 100.956);
        System.out.println(erg);

    }
}
