package de.lubowiecki.vererbung;

public class PolyTest2 {

    public static void main(String[] args) {

        ClassA a = new ClassA();

        System.out.println(a.zahl);
        System.out.println(a.andereZahl);
        //System.out.println(ClassA.andereZahl);
        a.machWas();
        a.machWasAnderes();
        //ClassA.machWasAnderes();

        System.out.println();

        ClassB b = new ClassB();

        System.out.println(b.zahl);
        System.out.println(b.andereZahl);
        //System.out.println(ClassB.andereZahl);
        b.machWas();
        b.machWasAnderes();
        //ClassB.machWasAnderes();

        System.out.println();

        ClassA ab = new ClassB();

        // Bei Variablen gibt es keine Polymorphismus
        System.out.println(ab.zahl);

        // ClassA.andereZahl; Bei statischen Variablen nutzt der Kompiler den Referenztyp
        System.out.println(ab.andereZahl);

        // Instanzmethoden werden auf dem Objekttyp ausgeführt (= Polymorphismus)
        ab.machWas();

        // ClassA.machWasAnderes(); Bei statischen Methoden nutzt der Kompiler den Referenztyp
        ab.machWasAnderes();
    }
}

class ClassA {

    public int zahl = 10;
    public static int andereZahl = 20;

    void machWas() {
        System.out.println("ClassA: machWas");
    }

    static void machWasAnderes() {
        System.out.println("ClassA: machWasAnderes");
    }
}

class ClassB extends ClassA {

    // Hiding
    public int zahl = 100;
    public static int andereZahl = 200;

    @Override
    void machWas() {
        {
            double zahl = 200; // Shadowing
        } // Lokale zahl Variable ist out-of-scope
        // Instanzvariable zahl ist wieder erreichbar
        System.out.println("ClassB: machWas");
    }

    static void machWasAnderes() {
        System.out.println("ClassB: machWasAnderes");
    }
}
