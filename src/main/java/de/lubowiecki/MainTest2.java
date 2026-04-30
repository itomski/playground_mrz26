package de.lubowiecki;

public class MainTest2 {

    public static void main(String[] args) {
        // statische Methoden dürfen nur statische Member direkt verwenden

        new MainTest2().start();
    }

    private void start() {

        machWas();
        machWasAnderes();
    }

    public void machWas() {
    }

    public void machWasAnderes() {
    }

}
