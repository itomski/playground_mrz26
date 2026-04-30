package de.lubowiecki.vererbung;

public class PolyTest3 {

    public static void main(String[] args) {
        A5 a = new B5();
        a.machWas();
        // a.machWasAnderes(); // Error: Methode hier nicht sichtbar
        //((B5)a).machWasAnderes();
    }
}

class A5 {

    public A5(String s) {
    }

    void machWas() {
        System.out.println("machWas: A");
    }

    private void machWasAnderes() {
        System.out.println("machWasAnderes: A");
    }
}

class B5 extends A5 implements Machbar {

    public B5() {
        this("B5");
    }

    public B5(String s) {
        // Parameter nötig: Elternklasse hat keinen parameterlosen Konstruktor!
        super(s);
        System.out.println(s);
    }

    @Override
    void machWas() {
        System.out.println("machWas: B");
    }

    // Kein Überschrieben!!!!
    void machWasAnderes() {
        System.out.println("machWasAnderes: B");
    }
}

interface Machbar {

//    @Override
//    default String toString() { // Error! Default darf keine Methoden von Object überschreiben
//        return "";
//    }

    @Override
    String toString(); // Als abstrakte Methode geht es... ist aber sinnfrei!
}
