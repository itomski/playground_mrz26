package de.lubowiecki.test;

public class ClassTest {

    // this = dieses Objekt
    // this kann nur von Instanzvariablen und Instanzmethoden verwendet werden
    // statische Variablen und Methoden haben kein Zugriff auf this!!!!!
    String s = this.toString();

    static int x, y = 10, z = x * y;

    // static int x, y, z; // Step 1
    // Step 2
    // x = 0;
    // y = 10;
    // z = x * y;

    public static void main(String[] args) {

        //int x, y = 10, z = x * y; // Kompilererror
        //int i = 0x20;

        System.out.println(new ClassTest().s);

        //sb.append(null); // Nicht klar, welche Methode genutzt werden soll
        //sb.append((String)null); // Ok
        String s = null;
        String sb = s +
                123;
        System.out.println(sb);

        Object[] arr = {null, null, null};
        //String[] strArr = (String[]) arr; // ClassCastException
        arr[1] = 100;

        // Ok
        Integer[] intArr = {1,2,3};
        Object[] objArr = intArr; // Ok
        //Double[] dblArr = intArr; // Error: Double ist kein Parant von Integer
        Number[] nrArr = intArr; // Ok

        //System.out.println(null + 'c'); // Error: null-Typ unklar
        System.out.println(s + 'c'); // null-Typ ist String daher Verkettung. null wird zu String "null"

        int i; // Ort der Deklaration bestimmt den Scope
        {
            i = 100;
            int j = 50;
            {
                i = 200;
                j = 100;
                System.out.println(j);
            }
        }
        System.out.println(i);
        //System.out.println(j); // Hier out of scope
        int j = 500; // Name der Variable wieder verfügbar

        System.out.println();

        String s1 = "Moin";
        String s2 = "Moin";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s2.intern()); // intern liefert die Referenz auf ein gleichwertigen String im Pool

        Integer i2 = 20;
        Double d = 20.0;
        System.out.println(Double.valueOf(i2 + d).intValue());
        System.out.println((int)(i2 + d));
        System.out.println(i2 + d.intValue());

        double j2 = 100.7;
        double j3 = 10.5;

        System.out.println((int)j2 + j3);
        System.out.println((int)(j2 + j3));

    }
}
