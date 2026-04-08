package de.lubowiecki.vererbung;

public class AbstractClassTest {

    public static void main(String[] args) {

        // CA c1 = new CA(); // abstrakte Klassen können nicht direkt instanziert werden
        CB c2 = new CB();

    }
}

interface CI {

    // Im Interface ist alles public
    // Alle Eigenschaften sind public static final
    // "Alle" Instanz-Methoden sind abstract
    // Ab Java 8 sind default Methoden erlaubt
    // Kann auch statische Methoden enthalten

    void machWas(); // automatisch abstract und public

    // default ist nur im Interface möglich
    default void machWasAnderes() {

    }
}

abstract class CA {

    // Kann unterschiedliche AccessModifier verwenden
    // Kann Instanz- und Klassenvariablen enthalten (auch Konstanten)
    // Kann fertige Instanz- und Klassenmethoden enthalten
    // Kann auch abstrakte Methoden enthalten
    // Können auch Konstruktoren haben. Können NUR von Kindklassen verwendet werden

    // abstract = Noch nicht fertig / Nicht direkt verwendbar

    public abstract void machWas(); // abstrakte Methode

    abstract void machWasAnderes(); // package-private

    private void machWasGanzAnderes() {} // abstrakte private Methoden gibt es nicht!

}

class CB extends CA {


    @Override
    public void machWas() {

    }

    @Override
    void machWasAnderes() {

    }
}

class CC implements CI {

    // Methode MUSS überschieben werden, da sie abstract ist
    @Override
    public void machWas() {

    }

    // Methode kann, muss aber nicht überschrieben werden, da sie default ist
    @Override
    public void machWasAnderes() {

    }
}