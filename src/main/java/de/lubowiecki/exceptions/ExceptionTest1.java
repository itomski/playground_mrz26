package de.lubowiecki.exceptions;

public class ExceptionTest1 {

    public static void main(String[] args) {

        String[] strArr;

        // Exceptions die NICHT gefangen werden brechen die Abarbeitung der Methode ab!
        try {
            strArr = new String[-15]; // NegativeArraySizeException
        }
        catch (Exception e) {
            System.out.println("NegativeArraySizeException");
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("----");

        strArr = new String[10];
        strArr[10] = "Moin";

    }
}
