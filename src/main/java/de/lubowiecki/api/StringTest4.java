package de.lubowiecki.api;

public class StringTest4 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        String s1 = "123";

        String s2 = sb1.toString();
        String s3 = sb2.toString();
        System.out.println(s2.equals(s3));

        System.out.println(sb1.equals(sb2)); // equals-Methode ist im StringBuilder NICHT!!!! überschrieben

        char c = 65_535;
        System.out.println(c);

        float f1 = 1.5f;
        float f2 = 1f;
        float f3 = .5f;
        float f4 = 1.f;

    }

}
