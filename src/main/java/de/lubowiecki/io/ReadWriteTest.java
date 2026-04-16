package de.lubowiecki.io;

import java.io.*;

public class ReadWriteTest {

    public static void main(String[] args) {

        //System.out.println((char)0xF95A);

        // IO, NIO, NIO2

        File file1 = new File("data.txt");
        File dir1 = new File("parentdir");
        File file2 = new File("parentdir", "data.txt");

        String userDir = System.getProperty("user.home");
        File file3 = new File(userDir, "data.txt");

        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);

        System.out.println("Ausführbar: " + file1.canExecute());
        System.out.println("Lesbar: " + file1.canRead());
        System.out.println("Schreibbar: " + file1.canWrite());
        System.out.println("Absolut: " + file1.getAbsolutePath());

        try {
            System.out.println(file1.createNewFile());

            if(!dir1.exists())
                System.out.println(dir1.mkdirs());

//            Writer out = new FileWriter(file1);
//            out.append("Das ist das Haus von Nikigraus");
//            out.close();

            try(Writer out = new FileWriter(file1, true)) {
                out.append("Das ist das Haus von Nikigraus\n");
                // out.close(); // wird automatisch aufgerufen
            } // Alle Resourcen, die im Kopf erzeugt wurden, werden automatisch geschlossen
        }
        catch(IOException e) { // CheckedException
            e.printStackTrace();
        }

        System.out.println();

        try(BufferedReader in = new BufferedReader(new FileReader(file1))) {

//            String line;
//            while((line = in.readLine()) != null) {
//                System.out.println(line);
//            }

            in.lines().forEach(l -> System.out.println(l));
        }
        catch(IOException e) { // CheckedException
            e.printStackTrace();
        }
    }
}
