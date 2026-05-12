package de.lubowiecki.test;

public class ClassCastTest {

    public static void main(String[] args) {

        Roomable r1 = new Tablet(); // Tablet IS-A Roomable
        Phone r2 = new Tablet(); // Tablet IS-A Phone
        //Roomable r3 = new Phone(); // Phone IS-NOT-A Roomable
        Roomable r3 = (Tablet)(new Phone()); // Tablet IS-A Phone, Tablet IS-A Roomable: ClassCastException

    }
}

interface Roomable {

}

class Phone {

}

class Tablet extends Phone implements Roomable {

}