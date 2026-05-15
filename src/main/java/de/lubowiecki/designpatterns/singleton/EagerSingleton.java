package de.lubowiecki.designpatterns.singleton;

import de.lubowiecki.api.StringTest4;

public class EagerSingleton {

    private StringBuilder sb = new StringBuilder();

    // Enthält eine statische Variable, die ein Objekt von sich selbst enthält
    private static final EagerSingleton instance = new EagerSingleton();

    // hat IMMER einen privaten Konstruktor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public String getContent() {
        return sb.toString();
    }

    public void addContent(String text) {
        sb.append(text);
    }
}
