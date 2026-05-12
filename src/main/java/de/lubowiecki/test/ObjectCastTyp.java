package de.lubowiecki.test;

public class ObjectCastTyp {

    public static void main(String[] args) {

        // Referenztyp: Object
        // Objekttyp: Integer (Heap)
        Object o = new Integer("100");
        //Object o = "Moin";
        //String s = (String) o; // ClassCastException

        System.out.println();

        X1 x1 = new X1();
        System.out.println(x1.getI());
        System.out.println(x1.i);

        System.out.println();

        x1 = new X2();
        System.out.println(x1.getI()); // Objekttyp entscheidend
        System.out.println(x1.i); // Referenztyp entscheidend

        System.out.println();

        x1 = new X3();
        System.out.println(x1.getI()); // Objekttyp entscheidend
        System.out.println(x1.i); // Referenztyp entscheidend



        int[] arr = null;
        int i = 0;
        try {
            arr[i = 2]++;
        }
        catch(RuntimeException e) {}

        System.out.println(i);


        StringBuilder sb = new StringBuilder();
        sb.append("01234567890");
        System.out.println(sb.capacity());
        sb.setLength(5);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}

class X1 {
    int i = 100;

    public int getI() {
        return i;
    }
}

class X2 extends X1 {
    int i = 200;

    public int getI() {
        return i;
    }
}

class X3 extends X2 {
    int i = 300;

    public int getI() {
        return i;
    }
}
