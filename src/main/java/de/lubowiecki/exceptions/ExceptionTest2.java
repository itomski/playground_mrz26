package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExceptionTest2 {

    public static void main(String[] args) {

        System.out.println("Start");

        // Uncheckd-Exception können IMMER gefangen werden
        try {

        }
        catch (RuntimeException e) {

        }

        // Checkd-Exceptions können NUR gefangen werden, wenn sie im try auch auftauchen können
        try {
            new FileInputStream("data.txt"); // Grund für die Exception
        }
        catch (IOException e) {

        }

        try {
            //Thread.sleep(1000); // Grund für die Exception
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) { // Checked

        }

        // Exception ist die einzige Checkd-Exceptions die keinen Grund für das catch braucht
        try {

        }
        catch (Exception e) { // Checked

        }
        System.out.println("Ende");
    }
}
