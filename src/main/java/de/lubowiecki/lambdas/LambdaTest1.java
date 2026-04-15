package de.lubowiecki.lambdas;

import java.util.function.Consumer;

public class LambdaTest1 {

    int j = 200;
    static int k = 300;

    public static void main(String[] args) {

        // FunctionalInterface: beschreibt, welche Signatur und Rückgabetyp die Methode haben MUSS
        // void run();
        Runnable r = () -> System.out.println("Moin"); // Implementierung der abstrakten Methode
        r.run(); // Implementierung wird ausgeführt


        Consumer<String> c1 = e -> System.out.println(e.toUpperCase());
        Consumer<String> c2 = (e) -> System.out.println(e.toLowerCase());
        Consumer<String> c3 = (e) -> System.out.println(e + "...");
        //c1.accept("Das ist das Haus von Nikigraus!");

        print("Das ist das Haus von Nikigraus", c3);

        MathOperation add, multi, div, sub;


        // final = Konstante
        // effektiv final = Ändert sich nicht
        final var i = 100;

        add = (x, y) -> {
            //...
            return x + y + i + k;
        };

        multi = (x, y) -> x * y;
        div = (x, y) -> x / y;
        sub = (x, y) -> x - y;

        System.out.println(add.exe(10, 15));
        System.out.println(sub.exe(10, 15.5));
        System.out.println(div.exe(10.2, 15));
        System.out.println(multi.exe(10.8, 15.19));

        ausfuehren(15.2, 99, div);
    }

    public static void print(String text, Consumer<String> fmt) {
        fmt.accept(text);
    }

    public static void ausfuehren(double a, double b, MathOperation op) {
        op.exe(a, b);
    }
}

@FunctionalInterface
interface MathOperation {

    double exe(double a, double b);

    //int exe(int a, int b);

    // Alle Methoden von Object können abstrakt eingebaut werden, ohne dass es das SAM stört
    public String toString();
}


/*
var func1a = function() {
    //...
}

var func1b = function() {
        //...
}

func1a();

var func2 = function(f) {
        f();
}

func2(func1a);
func2(func1b);
*/
