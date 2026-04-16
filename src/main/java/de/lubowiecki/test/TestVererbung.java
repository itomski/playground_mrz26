package de.lubowiecki.test;

import java.io.Serializable;
import java.util.List;

public class TestVererbung {

    public static void main(String[] args) {

        SpecialTest st = new SpecialTest();

        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        // Der Referenztyp entscheidet, welche Methoden sichtbar/verwendbar sind!

        // Referenztyp: Test
        // Objekttyp: SpecialTest
        Test t = new SpecialTest(); // SpecialTest IS-A Test
        t.machWas(); // Da SpecialTest die Methode überschrieben hat, nutzt es eine eigene

        // Referenztyp: Test
        // Objekttyp: Test
        t = new Test();
        t.machWas();

        // Referenztyp: Test
        // Objekttyp: VerySpecialTest
        t = new VerySpecialTest(); // VerySpecialTest IS-A Test
        t.machWas(); // Da VerySpecialTest keine eigene Methode hat, wird die geerbte verwendet


        // Referenztyp: Machbar
        // Objekttyp: SpecialTest
        Machbar m = new SpecialTest(); // SpecialTest IS-A Machbar

        // Referenztyp: Object
        // Objekttyp: SpecialTest
        Object o = new SpecialTest(); // SpecialTest IS-A Object

        // Casts
        //Integer i1 = (Integer)"Moin";

        Object o2 = "Moin"; // String IS-A Object: Upcast
        //Integer i2 = (Integer)o2; // Downcast: ClassCastException
        String s2 = (String)o2; // Downcast: Ok

        /*
        AA a = new AC(); // AC IS-A AA
        //AC c = new AA(); // AA IS-NOT AC: Compiler-Error
        AC c = (AC) new AA(); // AA IS-NOT AC (Downcast): ClassCastException zur Laufzeit
        */

        AA a = new AA();
        AC c = (AC) a;
    }
}

// AA IS-NOT!!!! AC
class AA {

}

// AC IS-A AA
class AC extends AA {

}


interface Machbar {

}

class Test {

    void machWas() {
        System.out.println("Test: machWas()");
    }
}

// IS-A wird durch Vererbung (Klasse oder Interface) sichergestellt
// SpecialTest IS-A Test
// SpecialTest IS-A Machbar
class SpecialTest extends Test implements Machbar {

    // HAS-A wird durch Attribute bereitgestellt
    private Test other; // SpecialTest HAS-A Test
    private List<Test> passd; // SpecialTest HAS-A List<Test>

    @Override
    void machWas() {
        System.out.println("SecialTest: machWas()");
    }
}

class VerySpecialTest extends Test {

}
