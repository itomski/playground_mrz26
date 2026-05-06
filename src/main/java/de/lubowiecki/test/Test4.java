package de.lubowiecki.test;

import de.lubowiecki.collections.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;

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


        Period p = Period.of(1,25,100);
        System.out.println(p);
        p = p.normalized();
        System.out.println(p);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
        p = Period.of(0,0,100);
        System.out.println(p);
        p = Period.of(1,0,800);
        System.out.println(p);

        System.out.println();

        // boolean test(T t);
        Predicate<Integer> kleinerAls10 = z -> z < 10;
        Predicate<String> startetMitT = (s3) -> s3.startsWith("T");

        System.out.println(kleinerAls10.test(5));
        System.out.println(kleinerAls10.test(7));
        System.out.println(kleinerAls10.test(22));

        System.out.println(startetMitT.test("Peter"));
        System.out.println(startetMitT.test("Toni"));

        Check sindGleich = (a2, b2) -> a2 == b2;
        System.out.println(sindGleich.test(10, 15));
        System.out.println(sindGleich.test(7, 7));

        LocalDate ld = LocalDate.of(2000, 10, 15);
        ld = ld.minusYears(2020);

        Locale.setDefault(Locale.US);

        // LocalDate: d D m M u y
        // LocalTime: H m s
        final DateTimeFormatter FMT1 = DateTimeFormatter.ofPattern("d. MMMM u");
        final DateTimeFormatter FMT2 = DateTimeFormatter.ofPattern("d. MMMM y G");
        System.out.println(ld.format(FMT1));
        System.out.println(FMT2.format(ld));

        LocalDateTime ldt = LocalDateTime.now();
        final DateTimeFormatter FMT3 = DateTimeFormatter.ofPattern("u/M/d H:m:s");
        System.out.println(ldt.format(FMT3));

        ldt = ldt.with(ChronoField.SECOND_OF_DAY, 1);
        System.out.println(ldt.format(FMT3));

    }
}

@FunctionalInterface // Ist ein SAM (Single Abstract Method)
interface Check {

    boolean test(int a, int b);
    // boolean test(int a);

}
