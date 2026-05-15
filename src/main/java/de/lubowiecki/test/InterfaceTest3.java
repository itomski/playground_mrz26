package de.lubowiecki.test;

public class InterfaceTest3 {

    public static void main(String[] args) {
        Integer o = new Integer(100);
        o.equals(100);

    }

}

interface TestXyz {

    // default kann nur in einem Interface verwendet werden
    // default ist KEIN access-modifiert

    // Instanzmethoden im Interface sind abstrakt...
    void machWas();

    // ... oder default
    // default Methoden haben IMMER einen Body (sind nicht abstrakt)
    // default NUR für Instanz-Methoden erlaubt
    default void machWasAnderes() {

    }

    // Statische Methoden MÜSSEN immer einen Body haben (sind NICHT abstrakt)
    // statische Methoden dürfen nicht default sein
    static void machWasGanzAnderes() {

    }
}

interface A5 {

    default int machWas() {
        return 10;
    }
}

interface A6 extends A5 {

    // Die abstrakte machWas deaktiviert die default-Implementierung aus A5
    int machWas();
}

class ConcretA5 implements A5 {
    // default Methode wird geerbt.
    // Implementierung der Methode ist optional
}

class ConcretA6 implements A6 {

    // die machWas-Methode MUSS implementiert werden

    @Override
    public int machWas() {
        return 0;
    }
}