package de.lubowiecki.test;

public class TestMethods {

    public static void main(String[] args) {

        // Referenz: MyRef : Entscheidet, was sichtbar ist
        // Objekttyp: MySub : Entscheidet welche Instanz-Methode tatsächlich ausgeführt wird
        MyRef r = new MySub();
        r.machWas(10.0);

        // Statische Methoden werden auf dem Referenztyp ausgeführt
        r.machWasStatic(123.5); // MyRef.machWasStatic(123.5);

        // Direkter Zugriff auf die Attribute erfolgt über den Referenztyp
        System.out.println(r.i);
        System.out.println(r.getI());

        // byte < short < int < long < float < double
        //         char <

        System.out.println('A' + 1);
        System.out.println((char)('A' + 1));

    }
}

class MyRef {

    public int i = 100;

    public void machWas(int i) {
        System.out.println("MyRef: " + i);
    }

    public void machWas(double i) {
        System.out.println("MyRef: " + i);
    }

    public static void machWasStatic(double i) {
        System.out.println("MyRef: " + i);
    }

    public int getI() {
        return i;
    }
}

class MySub extends MyRef {

    public int i = 200;

    public void machWas(double i) {
        System.out.println("MySub: " + i);
    }

    public static void machWasStatic(double i) {
        System.out.println("MySub: " + i);
    }

    @Override
    public int getI() {
        return i;
    }
}