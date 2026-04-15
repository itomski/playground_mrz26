package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class CalTest {

    public static void main(String[] args) {

        List<Eintrag> cal = new ArrayList<>();
        cal.add(new Eintrag("Essen mit Bruce", "Besprechung der neuen Quanten-Theorie", LocalDateTime.now().plusDays(2)));
        cal.add(new Eintrag("Einkaufen", "Zeug für die Party am WE", LocalDate.now().atTime(15,0)));
        cal.add(new Eintrag("Projektbesprechung", "Neue Aufgaben füpr Shield", LocalDateTime.of(2026, 5, 15, 17, 30)));

        Collections.sort(cal);

        System.out.println(cal);

        // Maps sind nicht prüfungsrelevant

        // Andere Implementierung
        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Kiel", 350_000);
        einwohner.put("München", 1_600_000);

        System.out.println(einwohner.get("Kiel"));
        System.out.println(einwohner);

        System.out.println();
        System.out.println();

        // Cal Alternative

        Map<LocalDate, List<Eintrag>> newCal = new HashMap<>();

        LocalDate zeitpunkt = LocalDate.now();
        newCal.put(zeitpunkt, new ArrayList<>());
        newCal.get(zeitpunkt).add(new Eintrag("Essen mit Bruce", "...", LocalDateTime.of(zeitpunkt, LocalTime.of(10,15)))); // Eintrag am Tag Hinzufügen

        System.out.println(newCal);
    }
}

// Comparable = Sortierbar
class Eintrag implements Comparable<Eintrag> {

    private String titel;
    private String beschreibung;
    private LocalDateTime zeitpunkt;

    public Eintrag(String titel, String beschreibung, LocalDateTime zeitpunkt) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.zeitpunkt = zeitpunkt;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDateTime getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(LocalDateTime zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\nZeitpunkt: ").append(zeitpunkt);
        sb.append("\nTitel: ").append(titel);
        sb.append("\nBeschreibung: ").append(beschreibung);
        return sb.toString();
    }

    @Override
    public int compareTo(Eintrag other) {
        // this wird automatisch verwendet
        return zeitpunkt.compareTo(other.zeitpunkt); // Nach Zeitpunkt vergleichen
    }
}
