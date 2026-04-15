package de.lubowiecki.test;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class TestApi {

    public static void main(String[] args) {

        //StringBuilder sb = new StringBuilder();


        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        String[] arr = new String[2]; // Wenn Array groß genug, wird es benutzt. Anderenfalls ein passendes erzeugt
        arr = strings.toArray(arr);
        for(String s : arr){
            System.out.print(s);
        }

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);

        System.out.println(Integer.max(arr2.get(0), 10));
        System.out.println(Math.max(arr2.get(0), 10));

        Wochentag tag = Wochentag.DIENSTAG;
        System.out.println(tag);
        System.out.println(tag.getZahl());
        System.out.println(tag.ordinal());

        Period p = Period.ofDays(300);
        p = Period.of(0, 0, 400);
        System.out.println(p.normalized()); // Tage werden NICHT in Monate normalisiert

        System.out.println();

        StringBuilder sb = new StringBuilder("12345678");


        char[] arr5 = new char[4];
        sb.getChars(1, 5, arr5, 0);
        for(char c : arr5) {
            System.out.println(c);
        }

        System.out.println();

        String s = String.join("/", "A", "B", "CX");
        System.out.println(s);

    }

}

enum Wochentag {
    MONTAG(10), DIENSTAG(20), MITTWOCH(30);

    private int zahl;

    Wochentag(int zahl) {
        this.zahl = zahl;
    }

    public int getZahl() {
        return zahl;
    }
}
