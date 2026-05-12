package de.lubowiecki.test;

public class InterfaceTest2 implements Something {

    static int i = 100;

    public InterfaceTest2() {
        int i = 11;
    }

    public static void main(String[] args) {

        System.out.println(i); // i wurde geerbt

    }
}

interface Something {

    int i = 10;

}