package de.lubowiecki.oop;

import java.util.Arrays;

public class InstanzenTest {

    public static void main(String[] args) {
        // System.out.println(this);

        Thing t1 = new Thing("Hammer");
        Thing t2 = new Thing("Zange");

        //t1.getContent();
        t2.getContent();


        try {
            System.out.println("xyz");
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            var err = e;
            System.out.println(err);
        }

        try {
            System.out.println(args[0]);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            var err = e;
            if (e instanceof ArrayIndexOutOfBoundsException) {
                err = new ArrayIndexOutOfBoundsException("Out of bounds");
            } else if (e instanceof NullPointerException) {
                err = new NullPointerException("Null Value");
            } else {
                err = new ArithmeticException("Arithmetic");
            }
            throw new RuntimeException(err);
        }
    }
}

class Thing {

    private String content;

    public Thing(String content) {
        this.content = content;
    }

    public String getContent() {
        // this ist eine Referenz auf das Objekt auf dem Heap, auf dem gerade die Methode ausgeführt wird
        System.out.println(this);
        splitContent(); // Instanzmethoden werden auf dem this ausgeführt
        return content;
    }

    public void splitContent() {
        System.out.println(Arrays.toString(content.split("")));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Thing{");
        sb.append("content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
