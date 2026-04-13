package de.lubowiecki.time;

import java.time.*;

public class YearAndCoTest {

    public static void main(String[] args) {

        int jahr1 = 2000;

        Year jahr2 = Year.now(); // 2026: Aktuelles Jahr
        jahr2 = Year.of(2000); // Neues Jahr: 2000, ersetzt das vorherige Objekt

        YearMonth ym = jahr2.atMonth(12); // Verbindet Jahr und Monat
        LocalDate ld = ym.atDay(10);

        LocalDateTime ldt = ld.atTime(LocalTime.now()); // Verbindet LocalDate mit LocalTime zu einem LocalDateTime

        LocalTime lt = LocalTime.of(12,0);
        ldt = lt.atDate(ld); // Verbindet LocalTime mit LocalDate zu einem LocalDateTime
    }
}
