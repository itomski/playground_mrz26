package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Locale;

public class PeriodTest {

    public static void main(String[] args) {

        Period abstand = Period.of(0,2,35);
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld = ld.plus(abstand);
        System.out.println(ld);
        ld = ld.minus(abstand);
        System.out.println(ld);

        System.out.println("-----------------");

        System.out.println(Locale.getDefault());
        System.out.printf("%.2f", 100.86);
        System.out.println();
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f", 100.86);
        System.out.println();

        System.out.println(System.getProperties());
        System.out.println();
        System.out.println(System.getProperty("user.timezone")); // Auslesen
        //System.setProperty("user.timezone", "..."); // Ändern

        System.out.println();

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);



    }
}
