package de.lubowiecki.local;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties prop = new Properties();
//        prop.setProperty("user", "admin");
//        prop.setProperty("password", "geheim");
//        prop.setProperty("location", "c:\\ordner\\datei.txt");

//        System.out.println(prop.getProperty("user", "Unbekannt"));
//        System.out.println(prop.getProperty("age", "Unbekannt"));
//        System.out.println(prop.getProperty("abteilung", "Unbekannt"));

        // Shreiben

//        try(Writer out = new FileWriter("conf.properties")) {
//            prop.store(out, null);
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }

//        try(OutputStream out = new FileOutputStream("conf.xml")) {
//            prop.storeToXML(out, null);
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }

//        try(Reader in = new FileReader("conf.properties")) {
//            prop.load(in);
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }

        try(InputStream in = new FileInputStream("conf.xml")) {
            prop.loadFromXML(in);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(prop.getProperty("user", "Unbekannt"));
        System.out.println(prop.getProperty("password", "Unbekannt"));
        System.out.println(prop.getProperty("location", "Unbekannt"));

        System.out.println("تشرفت بلقائك\n" +
                "// ما اسمك؟\n" +
                "// اسمك هو\n" +
                "// إلى اللقاء");
    }
}
