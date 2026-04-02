package de.lubowiecki.generics;

import de.lubowiecki.aufgaben.a8.Pilz;

public class FirstGenericTest {

    public static void main(String[] args) {

        StringBox box = new StringBox("Das ist das Haus von Nikigraus...");
        System.out.println(box.getContent());

        DoubleBox box2 = new DoubleBox(100.50);
        System.out.println(box2.getContent());

        System.out.println();

        GenericBox<String> gb1 = new GenericBox<>("Abc");
        System.out.println(gb1.getContent());

        GenericBox<Double> gb2 = new GenericBox<>(100.2);
        System.out.println(gb2.getContent());

        GenericBox<Pilz> gb3 = new GenericBox<>(new Pilz(true));
        System.out.println(gb3.getContent());

    }

}

// Container für einen Wert
class StringBox {

    private String content;

    public StringBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Container für einen Wert
class DoubleBox {

    private Double content;

    public DoubleBox(Double content) {
        this.content = content;
    }

    public Double getContent() {
        return content;
    }
}

// Generische Typen sind IMMER komplex
class GenericBox<T> {

    private T content;

    public GenericBox(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}