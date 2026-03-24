package de.lubowiecki.variablen;

public class FloatTest {

    public static void main(String[] args) {

        //float f1 = 10.0; // Error: 10.0 ist ein double Literal
        float f1 = 10.0f;
        machWas(10.0); // 10.0 = double Literal (Standard)
        machWas(10.0d); // 10.0d = double Literal
        machWas(10.0f); // 10.0f = float Literal

        double d1 = 10.0;
        machWas(d1);
        machWas(10.0);

        int a = 10;
        int b = 0;
        //System.out.println(a / b);

        double aa = 100;
        double bb = 0;
        System.out.println(aa / bb); // Infinity

    }

    static void machWas(float v) {
        System.out.println("FLOAT");
    }

    static void machWas(double v) {
        System.out.println("DOUBLE");
    }
}
