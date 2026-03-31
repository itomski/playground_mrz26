package de.lubowiecki.datentypen;

public class MathOpTest {

    public static void main(String[] args) {

        Integer a = 100;
        double b = 200.50;

        //Double d = 100; // Autoboxing von int zu Integer, komplex Widening von Integer auf Double (Error)

        //Integer.valueOf(10); // Boxing
        // a.intValue(); // Unboxing

        // Autounboxing von Integer auf int und primitive widening von int auf double
        System.out.println(a + b); // Wrappertypen werden zum rechnen immer ausgepackt

        boolean ok = false;

//        if(ok) {
//            int zahl = 10;
//        }
//        else {
//            int zahl = 20;
//        }
//        System.out.println(zahl);

        { // steuert die Verfügbarkeit der in diesem Block deklarierten Variablen
            int zahl;

            if (ok) {
                zahl = 10;
            } else {
                zahl = 20;
            }
            System.out.println(zahl);
        }
        //System.out.println(zahl); // Variable ist out-of-scope

    }
}
