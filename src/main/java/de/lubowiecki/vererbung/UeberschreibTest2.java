package de.lubowiecki.vererbung;

public class UeberschreibTest2 {

    public static void main(String[] args) {

        NumberTest1 nt2 = new NumberTest2();
        Number n = nt2.getNumber();

        NumberTest1 nt1 = new NumberTest2();

        Number n2 = 10; // Autoboxing von int auf Integer, komplex Widening von Integer auf Number
        //Double d1 = 10; // Autoboxing von int auf Integer, komplex Widening von Integer auf Double (Error)
    }
}

class NumberTest1 {

    Number getNumber() {
        return 10;
    }
}

class NumberTest2 extends NumberTest1 {

    // Gleicher Rückgabetyp
    // oder Co-Variant = Kindklasse von Original-Typ
    Double getNumber() {
        return 10.25;
    }
}