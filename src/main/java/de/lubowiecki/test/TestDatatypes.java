package de.lubowiecki.test;

public class TestDatatypes {

    // Instanz- oder Klassenvariablen bezeichnet man als Fields
    int x1 = 10; // (Instanzvariable) primitive Variable
    Integer x2 = 10; // (Instanzvariable) Referenzvariable (Autoboxing)

    // Wird über die Klasse aufgerufen: TestDatatypes.zahl
    // kann auch über die Objektreferenz aufgerufen werden (Kompiler tauscht die Referenz gegen den Klassennamen aus)
    static int zahl = 100;

    public static void main(String[] args) {

        // Lokale Variablen bezeichnet man nicht als Fields
        Integer i1 = Integer.valueOf("012"); // Verarbeitet Dezimal-System
        // i1 = 12; // Autoboxing int zu Integer
        // i1 = Integer.valueOf(12); // ohne Autoboxing
        System.out.println(i1);

        //System.out.println(Integer.toBinaryString(12));
        //i1 = Integer.decode("0xAB12"); // Verarbeitet Zahlensysteme
        i1 = Integer.valueOf("012", 8); // Verarbeitet Zahlensysteme
        System.out.println(i1);

        i1 = Integer.parseInt("1100011", 2); // Ohne redix nur Dezimal
        System.out.println(i1);

        int j;
        //System.out.println(j + 7); // Lokale Variablen MÜSSEN vor der Verwendung initialisiert werden!

        Boolean b = new Boolean(true);
        b = new Boolean("TruE");
        b = new Boolean("Tr_ue"); // nicht true
        b = new Boolean("T"); // nicht true
        System.out.println(b);

        byte b2 = 10;
        b2 += 10; // b2 = (byte)(b2 + 10);
        // b2 = b2 + 10; // Nach der Rechnung ein int

        Abc abc = new Abc() {}; // Anonyme Klasse extends Abc wird instanziert

        Character c = 'C';
        c = Character.valueOf('C');

        // List<Character>
        // Map<Boolean, List<String>>


    }
}

class Abc {

}

class Cde extends Abc {

}
