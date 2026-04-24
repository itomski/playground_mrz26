package de.lubowiecki;

public class MainTest {

//    public static void main(String[] args) {
//        System.out.println("Outer");
//    }

    public static void main(String... args) {
        System.out.println("Outer");
    }

    interface Inner {

        static void main(String[] args) {
            System.out.println("Inner");
        }
    }
}
