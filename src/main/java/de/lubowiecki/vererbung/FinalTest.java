package de.lubowiecki.vererbung;

public class FinalTest {
}

// Finale Klassen können nicht erweitert werden
//class SuperString extends String {
//
//}
//
//class MyInt extends Integer {
//
//}

/*
final class MyFinal {

}

class MySub extends MyFinal { // Error: finale Klassen darf man nicht erweitern

}
*/

class MyFinal {

    final void machWas() {
        System.out.println("MyFinal");
    }
}

class MySub extends MyFinal {

//    @Override
//    void machWas() { // Methode ist final = darf nicht überschrieben werden
//        System.out.println("MySub");
//    }
}