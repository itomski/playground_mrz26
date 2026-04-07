package de.lubowiecki.vererbung;

public class VererbungTest1 {

    // HAS-A
    // VererbungTest1 HAS-A String
    private String text = "Hallo";

    public static void main(String[] args) {

        // IS-A wird durch Vererbung realisiert
        // Integer IS-A Object
        Object o1 = 123; // int Autoboxing zu Integer, Integer IS-A Number IS-A Object
        Number n1 = 234; // int Autoboxing zu Integer, Integer IS-A Number

        String s1 = "Text";
        Object o2 = s1; // String IS-A Object
        CharSequence c1 = s1; // String IS-A CharSequence (String implementiert CharSequence)

        // Upcasting erfolgt automatisch
        // Kindklassen können jederzeit ohne Casting auf Referenzen ihrer Elternklassen/Interfaces zugewiesen werden

    }
}
