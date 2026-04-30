package de.lubowiecki.vererbung;

// Top-Level-Klasse
public class ClassTest {


    // Keine Top-Level-Klasse
    class Xyz {

    }


    public static void main(String[] a) {

        //a = new String[]{"10"};

        Trainer t1 = new Trainer("Peter");
        Trainer t2 = new Trainer("Carol");
        Trainer t3 = new Trainer("Bruce");

        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println(t3.name);

        System.out.println(t1.getClass() == t2.getClass()); // getClass liefert ein Objekt der Klassendefinition
        System.out.println(Trainer.count);

        int[] iArr = new int[3]; // Ein Array-Objekt + 3x 0 primitiv
        Integer[] inArr1 = new Integer[3]; // Ein Array-Objekt + 3x null
        Integer[] inArr2 = new Integer[]{1,2,3}; // Ein Array-Objekt + 3x Integer-Object

        System.out.println();

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char c = 'A';
        c++; // c = (char)(c + 1);

        System.out.println(getValue("Das ist das Haus von Nikigraus") + 3);
        System.out.println(getValue(123) + 3);

    }

    // Generische Methode
    static <T> T getValue(T s) {
        return s;
    }
}

class Trainer {

    static int count;

    String name;

    public Trainer(String name) {
        this.name = name + ": " + ++count;
    }
}

interface Xyz {

    default void machWas() {}

}
