package de.lubowiecki.vererbung;

public class UeberschreibTest {

    public static void main(String[] args) {

        Interface1 i1 = new Class1();
        i1.machWas();

        AbstractClass1 ac1 = new Class1();
        ac1.machWasGanzAnderes();

    }
}

interface Interface1 {

    // automatisch public
    void machWas();

}

abstract class AbstractClass1 {

    // Alle AccessModi möglich (private, package-private, protected, public)

    // abstrakte Methode
    abstract void machWasAnderes();

    // konkrete Methode
    void machWasGanzAnderes() {

    }
}

class Class1 extends AbstractClass1 implements Interface1 {

    @Override
    public void machWas() {

    }

    @Override
    void machWasAnderes() {

    }

    @Override
    public void machWasGanzAnderes() {

    }
}