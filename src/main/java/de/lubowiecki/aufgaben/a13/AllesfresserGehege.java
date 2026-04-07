package de.lubowiecki.aufgaben.a13;

import java.util.ArrayList;
import java.util.List;

public class AllesfresserGehege {

    private final List<Allesfresser> tiere = new ArrayList<>();

    public void hinzufuegen(Allesfresser tier) {
        tiere.add(tier);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AllesfresserGehege{");
        sb.append("tiere=").append(tiere);
        sb.append('}');
        return sb.toString();
    }
}
