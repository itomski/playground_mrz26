package de.lubowiecki.test;

import de.lubowiecki.collections.Person;

import java.util.Arrays;
import java.util.Objects;

// Eine Klasse kann nur eine Klasse extenden
// Eine Klasse kann 0 oder mehrere Interfaces implementieren
public class Test4 {

    public static void main(String[] args) {

        var _ = 100;
        var $ = 100;

        int[] arr = {2,3,4,5,6};
        Object o = arr;

        // TODO: Anonymes Array
        for(int i : new int[]{3,5,7,22,11}) {
            System.out.println(i);
        }

        // TODO: Anonymes Objekt
        int hash = Objects.hash(new Person("Peter", "Parker", 25));

        System.out.println(new Person("Peter", "Parker", 25));

        System.out.println("Moin");

        arr = new int[200];
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

        char c = 'x';
        System.out.println((int)c);
        System.out.println(c + 0); // char wird zu int (primitive Widening)
        arr[c] = 20; // Typen kleiner als int werden zu int
        System.out.println(Arrays.toString(arr));

        long l1 = 10; // primitive Widening von int auf long
        l1 = 1_000_000_000_000l; // wert zu groß für int L muss dazu geschrieben werden
        //Long l2 = 10; // Error: int Autoboxing zu Integer
        Long l2 = 10l; // Ok: long Autoboxing zu Long

        StringBuilder sb = new StringBuilder("ABCDE");
        sb.delete(2, 2); // Verändert nichts
        System.out.println(sb);

        int j = 20;
        for (j = 0; j < 100; j++) { // j kann auch außerhalb dieser Schleife deklariert werden

        }

        //int k;
        for (int k : new int[]{2,3,4,5}) { // k muss im Kopf dieser Schleife deklariert werden

        }

        System.out.println((j == 10)? "Moin" : false);
        var s = (j == 10)? "Moin" : false;
        System.out.println(s.getClass().getSimpleName());

        Object s1 = (j == 10)? "Moin" : false;

        var s2 = (j < 10)? 10 : 2.0;
        System.out.println(s2);

        System.out.println(5 & 7); // Bit-Wise
        //System.out.println(5 && 7); // Logisch (Nur mit boolean)
        System.out.println(true & false); // Bit-Wise (Bei boolean wie Logisch ohne short-circuite)
        System.out.println(true && false); // Logisch mit short-circuite
        System.out.println(5 | 7); // Bit-Wise
        System.out.println(true | false); // Bit-Wise(Mit boolean wie Logisch aber ohne short-circuite)
        System.out.println(true || false); // Logisch (nur mit boolean) mit short-circuite
        //System.out.println(5 || 7); // Error: Logisch

        System.out.println();

        int a = 10;
        int b = -10;
        int d = 3;
        int e = -3;
        System.out.println(a % d);
        System.out.println(a % e);
        System.out.println(b % d);
        System.out.println(b % e);

        System.out.println();

        System.out.println(a + " % " + d);
        System.out.println(Integer.remainderUnsigned(a, d));
        System.out.println(Integer.divideUnsigned(a, d));

        System.out.println();

        /*
        System.out.println(a + " % " + e);
        System.out.println(Integer.remainderUnsigned(a, e));
        System.out.println(Integer.divideUnsigned(a, e));

        System.out.println();

        System.out.println(b + " % " + d);
        System.out.println(Integer.remainderUnsigned(b, d));
        System.out.println(Integer.divideUnsigned(b, d));

        System.out.println();

        System.out.println(b + " % " + e);
        System.out.println(Integer.remainderUnsigned(b, e));
        System.out.println(Integer.divideUnsigned(b, e));
        */


        if(true)
            if(true)
                if(true);
                else System.out.println("Moin1");
                else System.out.println("Moin2");
                else System.out.println("Moin3");

    }
}
