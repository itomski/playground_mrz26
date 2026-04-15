package de.lubowiecki.vererbung;

public class DefaultMethodTest {

    public static void main(String[] args) {

        X x = new X();
        System.out.println(x.add(10, 15));

    }
}

class X implements Y, Z {

    // Lösung
    public int add(int a, int b) {
        return 0;
    }
}

interface Y {

    default int add(int a, int b) {
        return a + b;
    }
}

interface Z {

    default int add(int a, int b) {
        return a + b + a + b;
    }
}
