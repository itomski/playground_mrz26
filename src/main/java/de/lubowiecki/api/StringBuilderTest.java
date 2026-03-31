package de.lubowiecki.api;

import de.lubowiecki.methoden.Hero;

public class StringBuilderTest {

    public static void main(String[] args) {

        String s = "";
        for (int i = 0; i < 10; i++) {
            s += i;
        }
        System.out.println(s);

        System.out.println();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(sb);

        sb = new StringBuilder();
        System.out.println(sb.capacity()); // größe des inneren Arrays in Anzahl der Zeichen umgerechnet
        sb.append("ABÖÄßEFGHIJÜLGZR"); // Ans Ende dranhängen
        // Ist die Größe nicht mehr ausreichend, wird sie automatisch angepasst (neueGröße = alteGröße * 2 + 2)
        sb.append("1");
        sb.append("23332444423W332332332332323");
        System.out.println(sb.capacity());

        System.out.println();

        sb = new StringBuilder();
        sb.append("12345678"); // Ans Ende dranhängen
        sb.insert(4, "xyz");
        sb.delete(2, 5); // löscht Zeichen von Position bis Position
        System.out.println(sb);

        String name = "Peter";
        sb.append("ABC").append(120).append("XYZ").append(name);
        sb.append("ABC" + 120 + "XYZ" + name);

        System.out.println();

        // Konstruktoren
        // Capacity ist die Anzahl von Zeichen
        sb = new StringBuilder(); // StringBuilder ist leer und hat eine Capacity von 16
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println();

        sb = new StringBuilder(100); // StringBuilder ist leer und hat eine Capacity von 100
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println();

        sb = new StringBuilder("Das ist"); // StringBuilder ist 7 Zeichen lang und hat eine Capacity von 7 + 16
        System.out.println(sb.capacity());
        System.out.println(sb.length()); // Liefert die Anazahl von Zeichen
        System.out.println();

        Hero h = Hero.create();
        System.out.println(h); // StringBuilder in toString

        System.out.println();

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.setLength(3); // Schneidet den Inhalt des StringBuilders zu, oder erweitert ihn
        System.out.println('|' + sb.toString() + '|');
        sb.setLength(20);
        System.out.println('|' + sb.toString() + '|');

        System.out.println();

        sb = new StringBuilder();

        // Stelle sich, dass 100 Zeichen eingefügt werden können, ohne die Capacity später ändern zu müsen
        // Ändert nur dann die Capacity, wenn sie nicht ausreicht
        sb.ensureCapacity(100);
        sb.append("0123456789");
        sb.append("ABCDEFGHIJ");
        sb.trimToSize(); // Capacity wird auf die benötige Größe zugeschnitten
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println();

    }
}
