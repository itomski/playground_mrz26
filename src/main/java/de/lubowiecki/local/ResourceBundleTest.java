package de.lubowiecki.local;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ResourceBundleTest {

    public static void main(String[] args) {

        Locale.setDefault(Locale.FRENCH);
        ResourceBundle bundle = ResourceBundle.getBundle("lang.gui");

        final Scanner scanner = new Scanner(System.in);

        System.out.println(bundle.getString("greeting"));
        System.out.print(bundle.getString("question") + ": ");
        String name = scanner.nextLine();
        System.out.println(bundle.getString("answer") + " " + name);
        System.out.println(bundle.getString("farewell"));

        double preis = 1279.95;
        System.out.printf("%.2f €", preis);

        System.out.println();

        DecimalFormat df = new DecimalFormat("#,###.00 €");
        System.out.println(df.format(preis));


    }
}
