package de.lubowiecki.aufgaben.a13;

// Keine Instanzen direkt von Tier möglich
public abstract class Tier {

    private String name;

    public Tier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}
