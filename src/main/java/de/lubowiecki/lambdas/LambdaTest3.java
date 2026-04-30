package de.lubowiecki.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaTest3 {

    public static void main(String[] args) {

        MatOperation op = (a, b) -> a * b;

        BinaryOperator<Double> op2 = (a, b) -> a * b;

        IntBinaryOperator add = (a, b) -> a + b;
        // int, long, double

        System.out.println(add.applyAsInt(10, 15));

        // Predicate ist das einzige Build-In-Functional-Interface für OCA

        long l = 0xffffffffffffffffL;
        long l2 = 12; // Ok: int primitive Widening
        //Long l3 = 12; // Error: Autoboxing
    }
}

// Functional Interface ist ein SAM (Single Abstract Method)
@FunctionalInterface
interface MatOperation {

    double execute(double a, double b);

    //double execute(double a, double b, double c);

    // Alle Methoden von Object können zusätzlich als abstrakte Methoden hinzugefügt werden

    @Override
    String toString();
}