package de.lubowiecki.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class MethodTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();

        Instant now = Instant.now();
        ld = LocalDate.ofInstant(now, ZoneId.systemDefault()); // LocalDate auf Basis der Maschienenzeit

        System.out.println(ld.get(ChronoField.DAY_OF_WEEK));
        System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ld.get(ChronoField.DAY_OF_YEAR));

        System.out.println(ld);
        //ld = ld.with(ChronoField.DAY_OF_YEAR, 1); // Überschreiben einzelner Informationen
        ld = ld.with(ChronoField.DAY_OF_MONTH, 1); // Überschreiben einzelner Informationen
        System.out.println(ld);

        LocalDate wm = LocalDate.of(2026, 6, 11);

        ld = LocalDate.now();
        System.out.println(ld.until(wm, ChronoUnit.DAYS) + " Tage bis WM");
        Period p = ld.until(wm);
        System.out.println(p);

    }
}
