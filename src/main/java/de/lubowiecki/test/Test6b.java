package de.lubowiecki.test;

public class Test6b {

    public static void main(String[] args) {
        int i = 10;

        if (i < 100)
            if (i < 8)
                if (i < 5)
                    System.out.println(1); // Body vom letzten if
                else System.out.println(2);
            else System.out.println(3);

        var et1 = new ExualsTest("123");
        var et2 = new ExualsTest("123");
        System.out.println(et1.equals(et2));
        System.out.println(et1 == et2);

        Jump[] arr1 = new Jump[10]; // new = neues Array von Jump-Elementen
        //Jump[] arr2 = new Jump()[10]; // neu = neues Jump. Error, da ein Interface
        Jump[] arr3 = new Animal[10]; // Jedes Animal ist Jump
        Object[] arr4 = new String[10]; // Auch OK. Jeder String ist ein Object

        Byte b1 = 100;
        Long l1 = (long)20;
        // Unboxing + primitive Narrowing gleichzeitig nicht möglich
        // Unboxing + primitive Widening ok
        //Float f1 = (float)b1 + (int)l1; // Error

        do // Bei mehr als einer Anweisung muss man klammern
            System.out.println("X"); // System.out.println();
        while(true);

    }
}

class ExualsTest {

    String content;

    public ExualsTest(String content) {
        this.content = content;
    }
}

interface Jump {

}

class Animal implements Jump {

}
