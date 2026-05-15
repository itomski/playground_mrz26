package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class FutureTest {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Datum: ");
        String eingabe = scanner.next();

        //final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");  // dd.MM.yyyy
        final DateTimeFormatter OUTPUT_FMT = DateTimeFormatter.ofPattern("EEE d MMMM yyyy G");
        final DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        //LocalDate ld = LocalDate.parse(eingabe); // Nach ISO-Format: yyyy-MM-dd
        LocalDate ld = LocalDate.parse(eingabe, FMT); // Verwendet ein eigenes Format
        if(ld.isBefore(LocalDate.now())) { // Ist die Eingabe in der Vergangenheit?
            System.out.println("Fehler!");
        }
        else {
            System.out.println("Super!");
        }

        if(ld.isAfter(LocalDate.now())) {
            System.out.println("Super!");
        }
        else {
            System.out.println("Fehler!");
        }

        System.out.println(ld.format(FMT));
        System.out.println(ld.format(OUTPUT_FMT));
    }
}
