package de.lubowiecki.aufgaben.a8;

public class Pilz {

    private boolean eingesammelt;
    private boolean giftig;

    public Pilz(boolean giftig) {
        this.giftig = giftig;
    }

    public boolean isEingesammelt() {
        return eingesammelt;
    }

    public void setEingesammelt(boolean eingesammelt) {
        this.eingesammelt = eingesammelt;
    }

    @Override
    public String toString() {
        return giftig ? "\uD83C\uDF44" : "\uD83C\uDF44\u200D\uD83D\uDFEB"; // Pilz Unicode
    }
}
