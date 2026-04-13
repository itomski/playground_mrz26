package de.lubowiecki.time;

import java.time.Duration;
import java.time.Instant;

public class InstantTest {

    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 1000; i++) {
//            //...
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println(end - start + "ms");


        // Instant = Maschinenzeit

        Instant start = Instant.now();

        for (int i = 0; i < 1000; i++) {
            //...
        }

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis() + "ms");
    }
}
