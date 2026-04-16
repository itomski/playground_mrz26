package de.lubowiecki.test;

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

    }
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
