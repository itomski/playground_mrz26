package de.lubowiecki.vererbung;

public class ClassInterfaceTest {

    public static void main(String[] args) {

        System.out.println(A.zahl);
        System.out.println(A.machWas());
        System.out.println((new A(){}).machWasAnderes());
        System.out.println(B.zahl);
        //System.out.println(B.machWas()); // Error: B hat die statische Methode NICHT geerbt
        System.out.println((new B(){}).machWasAnderes()); // Ok. Instanzmethode wurde geerbt

        System.out.println();
        System.out.println(AxA.andereZahl);
        System.out.println(AxA.machWas());
        System.out.println(new AxA().machWasAnderes());

        System.out.println(AxB.andereZahl); // statische Variable wurde geerbt
        System.out.println(AxB.machWas()); // statische Methode wurde geerbt
        System.out.println(new AxB().machWasAnderes()); // Instanzmethode auch geerbt

    }
}

interface A {

    // alle Attribute im Interface sind public static final
    // Attribute im Interface werden vererbt
    int zahl = 100;

    // static Methoden werden NICHT vererbt
    static int machWas() {
        return zahl;
    }

    // Eine Instanzmethode
    default int machWasAnderes() {
        return zahl;
    }

    //int machWasAnderes(int i);
}

interface B extends A {
}

class AxA {

    // Instanzvariable
    int zahl = 200;
    // Klassenvariable
    static int andereZahl = 300;

    // Klassenmethode
    static int machWas() {
        return andereZahl;
    }

    // Instanzmethode
    int machWasAnderes() {
        return zahl;
    }
}

class AxB extends AxA {
}


