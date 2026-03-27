package de.lubowiecki;

public class MemoryTipp {

    public static void main(String[] args) {

        //...

        workWithArray();

        //...

        { // definiert einen scope
            int[] arr = new int[1_000_000];

            if(true) {
                System.out.println(arr[10]); // Ok
            }
            // Variablen, die in diesem Block deklariert werden, werden am Ende des Blocks freigegeben
        }
        //System.out.println(arr[10]); // arr ist out-of-scope

    }

    private static void workWithArray() {
        int[] arr = new int[1_000_000];
        // Am Ende der Methode ist das Array für den GC verfügbar
    }
}
