package de.lubowiecki.aufgaben.a13;

import java.util.ArrayList;
import java.util.List;

public class PflanzenfresserGehege {

    private final List<Pflanzenfresser> tiere = new ArrayList<>();

    public void hinzufuegen(Pflanzenfresser tier) {
        tiere.add(tier);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PflanzenfresserGehege{");
        sb.append("tiere=").append(tiere);
        sb.append('}');
        return sb.toString();
    }
}
