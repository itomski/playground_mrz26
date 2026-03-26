package de.lubowiecki.api;

public class StringTest1 {

    public static void main(String[] args) {

        String s1 = "Moin"; // Landet im String Literal Pool
        String s2 = new String("Moin"); // Landet NICHT im Pool
        String s3 = "Moin"; // Zeigt auf das Objekt im Pool

        System.out.println(s1 == s2); // == bei komplexen Datentypen prüft, ob es das gleich Objekt auf dem Heap ist
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2)); // Vergleicht den Inhalt
        System.out.println(s1.equals(s3));


        System.out.println();

        System.out.println("(fsdfsd)" == "(fsdfsd)");
        System.out.println("(fsd"+"fsd)" == "(fsdfsd)");
        System.out.println("(fsd".concat("fsd)") == "(fsdfsd)");
        System.out.println(new String("(fsdfsd)") == "(fsdfsd)");

        s1 = s1.toUpperCase(); // Strings, die mit Methoden erzeugt werden landen ncht im POOL

        System.out.println();

        System.out.println("(fsdfsd)".toLowerCase() == "(fsdfsd)".toLowerCase());
        System.out.println("(fsdfsd)".toUpperCase() == "(fsdfsd)".toUpperCase());

    }
}
