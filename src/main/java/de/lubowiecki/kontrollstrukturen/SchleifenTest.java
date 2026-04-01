package de.lubowiecki.kontrollstrukturen;

public class SchleifenTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10_000_000; i++) {
            // System.out.println(i);
            sb.append(i);
        }

        System.out.println(sb);

        long end = System.currentTimeMillis();

        System.out.println(end - start + "ms");

    }
}
