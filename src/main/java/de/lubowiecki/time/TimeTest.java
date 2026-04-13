package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeTest {

    public static void main(String[] args) {

        // LocalDate, LocalTime, LocalDateTime sind immutable

        // Datum
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld = LocalDate.of(2025, 1, 25);
        //ld = LocalDate.of(2025, Month.FEBRUARY, 29);
        //ld = LocalDate.of(2025, 15, 29);

        System.out.println();

        // Uhrzeit
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        lt = LocalTime.of(15, 45);
        System.out.println(lt);

        System.out.println();

        // Datum und Uhrzeit
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);
        ldt = LocalDateTime.of(2020, 10, 12, 10, 33);
        System.out.println(ldt);


    }
}
