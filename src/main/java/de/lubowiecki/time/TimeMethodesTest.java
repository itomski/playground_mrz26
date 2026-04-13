package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeMethodesTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld = ld.plusWeeks(2);
        System.out.println(ld);
        ld = ld.minusDays(2);
        ld = ld.minusYears(10);

        if(ld.isSupported(ChronoUnit.HOURS))
            ld = ld.plus(100, ChronoUnit.HOURS); // Unterstützt nur mögliche Einheiten

        System.out.println(ld);

    }
}
