package de.lubowiecki.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TestFinal2 {

    final int x = 10;


    // java de.lubowiecki.test.TestFinal2 A B C 1 2 3
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // 16
        //sb = new StringBuilder("Text"); // Anzahl Zeichen + 16
        //sb = new StringBuilder(100); // int als capacity
        sb.ensureCapacity(25);
        System.out.println(sb.capacity());

        sb.append("ABC");
        System.out.println(sb.capacity());

        sb.trimToSize(); // Schneidet die capacity auf die Size zu
        System.out.println(sb.capacity());

        // Verändert den Inhalt
        sb.setLength(1); // Passt die capacity an die Length an (wenn zu klein)
        System.out.println("|" + sb + "|");
        System.out.println(sb.capacity());

        sb.delete(0,3); // Löscht Zeichen
        System.out.println("|" + sb + "|");
        System.out.println(sb.capacity());

        char[ ] chars = {'A','B','C','D','E','F'};
        String out = String.copyValueOf(chars, 1, 5);
        System.out.println(out);

        System.out.println();

        chars = new char[10];
        chars[0] = 0;
        chars[1] = 2;
        out = "123456789";
        out.getChars(0, 3, chars, 2);
        for( char c : chars)
            System.out.print(c);


        System.out.println("\n-------------");

        //LocalDate l = LocalDate.of(2014, 1, 31).plusMonths(1);
        //LocalDate l = LocalDate.of(2014, 1, 31).plusDays(30);
        //LocalDate l = LocalDate.of(2014, 7, 31).plusMonths(1);
        LocalDate l = LocalDate.of(2012, 2, 29).plusYears(1);
        //LocalDate l = LocalDate.of(2012, 1, 31).plusMonths(1);
        System.out.println(l);

        System.out.println();

        // LocalDate, LocalTime und LocalDateTime sind immutable

        l = LocalDate.of(2012, 2, 29);
        System.out.println(l);
        l = l.minus(10, ChronoUnit.DAYS);
        System.out.println(l);

        System.out.println("----------------");

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        //ld = ld.plus(5, ChronoUnit.HOURS); // Unsupported unit: Hours
        LocalDateTime ldt = ld.atTime(LocalTime.now());
        System.out.println(ldt);
        System.out.println(ldt.toLocalTime());
        System.out.println(ldt.toLocalDate());

        // Nur mit einem Array nutzbar
        machWas(new int[]{1,2,3});

        // Geht mit einem Array
        machWasAnderes(new int[]{1,2,3});
        machWasAnderes(1,2,3,4,5,6); // Oder als Einzelwerte

        //System.out.println(!true); // logisch: nur mit boolean möglich
        //System.out.println(~15); // bitwise: nur mit Zahlen möglich

        final int x = 10; // Kompiletime Konstante = Deklaration und Initialisierung in einem
        final int y;
        y = 10; // Runtime Konstante = Deklaration und Initialisierung sind getrennt

        int i = 2;

//        if(i++ > 0 | i-- < 2) {
//
//        }
//
//        if(i++ > 0 || i-- < 2) {
//
//        }

//        String str = null;
//
//        if(str != null && str.length() > 0) { // Ok: Short-Circuit
//
//        }
//
//        if(str != null & str.length() > 0) { // NullPointerException
//
//        }

        System.out.println(0.0 == 0.0);
    }

    public static void machWas(int[] arr) {
    }

    public static void machWasAnderes(int... werte) {
    }

    public static void machWasAnderes(int i) {
    }

}
