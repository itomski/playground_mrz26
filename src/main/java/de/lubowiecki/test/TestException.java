package de.lubowiecki.test;

public class TestException {

    static Integer i = 0; // null

    public static void main(String[] args) {

        //System.out.println(10 / 0); // ArithmeticException bei Ganzzahlen

        // Bei float und double keine ArithmeticException
        System.out.println(10.0 / 0);
        System.out.println(0.0 / 0);

        System.out.println(getZahl());

        //int i = Integer.parseInt(null);
        //System.out.println(i + 10);

        String s1 = "Hallo";
        Object o = s1; // String IS-A Object (Upcast)
        String s2 = (String)o; // Downcast (Cast wird benötigt)
        System.out.println(s2);

        //Integer s = (Integer)"1234"; // Error


        Byte b = 123;
        Number n = b;
        //Integer i = (Integer)n; // ClassCastException
        Integer i = n.intValue(); // Ok: Konvertierung über Methoden von Number

    }

    // Methoden mit Return-Type geben entweder einen passenden Wert zurück oder sie werfen eine Exception
    static int getZahl() {
        try {
            throw new UnsupportedOperationException("Methode noch nicht eingebaut!");
            // return 10;
        }
        finally {
            return 20; // Exception wird durch das return von 20 ersetzt
        }
    }
}
