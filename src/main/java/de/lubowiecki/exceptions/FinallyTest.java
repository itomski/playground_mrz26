package de.lubowiecki.exceptions;

public class FinallyTest {

    public static void main(String[] args) {

        try {
            System.out.println(getInt());
        }
        catch(RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            System.out.println(getDouble());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println(getInt2());
    }

    private static int getInt() {

        try {
            throw new RuntimeException("...");
        }
        finally {
            return 10;
        }
    }

    private static double getDouble() throws Exception {
        try {
            throw new Exception();
        }
        finally {
            return 20.0;
        }
    }

    private static int getInt2() {
        try {
            return 25;
        }
        finally {
            return 100;
        }
    }
}
