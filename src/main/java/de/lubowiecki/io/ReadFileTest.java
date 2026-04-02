package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileTest {

    // throws verpflichtet den Aufrufer der Methoder zur Behandlung der Exception
    public static void main(String[] args) throws IOException {

        // IO: Alte Bibliothek
        // NIO, NIO2: Neue Bibliothek

        Path pfad = Paths.get("data.txt");
        List<String> zeilen =  Files.readAllLines(pfad);

//        for(String zeile : zeilen) {
//            System.out.println(zeile);
//        }

        Iterator<String> itr = zeilen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
