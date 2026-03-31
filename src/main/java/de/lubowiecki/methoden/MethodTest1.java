package de.lubowiecki.methoden;

public class MethodTest1 {

    public static void main(String[] args) {

        // Wenn eine Methode einen Parameter verlangt darf void nicht als Parameter verwendet werden

        // System.out.println(machWas(2)); // Error: void kann nicht geprintet werden
        System.out.println(); // Hier darf auch kein void genutzt werden

        System.out.println(machWasAbderes(2));

        // System.out.println(System.out.println("...")); // Error!
        // Math.pow(2, 2);

        System.out.println(); // Produziert eine Leerzeile, wenn kein Parameter übergeben wird
        // System.out.print(); // Error: Darf nicht leer aufgerufen werden!!!!

    }


    // void = nichts
    static void machWas(int i) {

        System.out.println(1);
        if(i == 2) return; // Methode wird vorzeitig verlassen

        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        // Methoden mit void als Rückgabetyp brauchen kein return
    }

    static int machWasAbderes(int i) {

        System.out.println(1);
        if(i == 2) return 100; // Methode wird vorzeitig verlassen

        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        return 500; // Return-Wert MUSS zurückgegeben werden!
        // Einzige Ausnahme ist eine Exception

        //System.out.println("Moin"); // Error: Unreachable Code
    }


}
