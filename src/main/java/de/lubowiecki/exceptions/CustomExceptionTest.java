package de.lubowiecki.exceptions;

public class CustomExceptionTest {

    public static void main(String[] args) {
        try {
            new CustomExceptionTest().start();
        }
        catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e);
        }
    }

    private void start() throws Exception {
        try {
            aktionAusfuehren(-20);
        }
        catch(ZuKeinException e) {
            throw new Exception(e);
            //System.out.println("<");
        }
        catch(ZuGrossException e) {
            throw new Exception(e);
            //System.out.println(">");
        }
        catch(RuntimeException e) {
            System.out.println("Problem");
        }
    }

    void aktionAusfuehren(int zahl) throws ZuKeinException, ZuGrossException {

        if(zahl < 0) {
            throw new ZuKeinException("...");
        }
        else if(zahl > 100) {
            throw new ZuGrossException();
        }

        System.out.println("Zahl wird verarbeitet");
    }
}

class ZuKeinException extends RuntimeException {

    public ZuKeinException() {
        super("Zu klein!");
    }

    public ZuKeinException(String message) {
        super(message);
    }
}

class ZuGrossException extends RuntimeException {

    public ZuGrossException() {
    }

    public ZuGrossException(String message) {
        super(message);
    }
}
