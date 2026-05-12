package de.lubowiecki.test;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test6 {

    public Test6(Test6 t) {
        //...
    }

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i++ + i);


        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
//        if(ld.isBefore(lt)) {
//        }

        System.out.println();

        Xyz x1 = () -> System.out.println(100);
        // x1 = () -> 100; // muss void zurückgeben

        // Lambdas sind eine Kurzschreibweise für eine anonyme Klasse mit nur einer einzigen abstrakten Methode

        // Als anonyme Klasse
//        x1 = new Xyz() {
//            @Override
//            public void machWas() {
//                //...
//            }
//        };

        Abc1 a1 = (a) -> System.out.println(a);
        Abc1 a2 = a -> System.out.println(a); // Bei einem einzigen Parameter auch ok

        Abc2 a3 = a -> a + 100;
        Abc2 a4 = a -> { // für die Verwendung von "return" muss das Labda {} nutzen, wie bei normalen Methoden
            a += 100;
            return a;
        };
        System.out.println(a3.machWas(10));
        System.out.println(a3.machWas(20));
        System.out.println(a3.machWas(30));

        System.out.println();

        String in = "SO";

        switch(in) {
            case "MO": System.out.println("Montag");
            case "DI": System.out.println("Dienstag");
            case "MI": System.out.println("Mittwoch");
            case "DO": System.out.println("Donnerstag");
            case "FR": System.out.println("Freitag");
            case "SA", "SO": System.out.println("Wochenende"); break;
            default:
                System.out.println("Ungültig");
        }

        String s = "" +
                "";

        x1.machWas();

    }
}

interface Xyz {
    void machWas();
}

interface Abc1 {
    void machWas(int i);
}

interface Abc2 {
    int machWas(int i);
}
