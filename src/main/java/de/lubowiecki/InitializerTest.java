package de.lubowiecki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalTime;

public class InitializerTest {

    public static void main(String[] args) {

        C c1 = new C();
//        C c2 = new C();
//        C c3 = new C();
//        B b1 = new B();
//        A a1 = new A();

    }
}

class A {
    static {
        System.out.println("SI: A");
    }

    // Instanzinitialiser
    {
        System.out.println("II: A");
    }

    public A() {
        super();
        // Initialiser wird ausgeführt
        System.out.println("C: A");
    }
}

class B extends A {

    static {
        System.out.println("SI: B1");
    }

    static {
        System.out.println("SI: B2");
    }

    {
        System.out.println("II: B1");
    }

    public B() {
        super();
        // Instanz-Initialiser
        System.out.println("C: B");
    }

    {
        System.out.println("II: B2");
    }
}

class C extends B {

    public final static int zahl;

    static {
        // Eine Exception im Init-Block führt zu einem Error!
        if(LocalTime.now().isBefore(LocalTime.of(10,30))) {
            zahl = 10;
        }
        else {
            zahl = 20;
        }
        System.out.println("SI: C");
    }

    {
        System.out.println("II: C");
    }

    public C() {
        super();
        // Instanz-Initializer
        System.out.println("C: C");
    }

//    static void machWas() {
//    }
}
