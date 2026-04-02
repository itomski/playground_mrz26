package de.lubowiecki.kontrollstrukturen;

public class ForSchleifenTest {

    private static final String BREAK = "------------------------------------";

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(BREAK);

        int i = 0;
        for(; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(BREAK);

        i = 0;
        for(; i < 10;) {
            System.out.println(i++);
        }

        System.out.println(BREAK);

//        i = 0;
//        for(;;) { // Endlosschleife
//            System.out.println(i++);
//        }
//
//        System.out.println(BREAK);

        for(int x = 0, y = 10; x != y; x++, y--) { // Endlosschleife
            System.out.println(x + " " + y);
        }

        System.out.println(BREAK);

        for(int j = 0; j < 10; System.out.println(++j)); // ; = Kein Body

        System.out.println(BREAK);

        for(int j = 0; j < 10; j++, System.out.println(j)); // ; = Kein Body

        System.out.println(BREAK);

        for (int j = 0; j < 10; j++) {
            System.out.print(j + ": ");
            for (int k = 0; k < 10; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println(BREAK);

        int[][] arr = new int[3][];
         /* {
            0: null,
            1: null,
            2: null
            }
        */

        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[5];

        /* {
            0: {0: 0, 1: 0, 2: 0, 3: 0},
            1: {0: 0, 1: 0, 2: 0},
            2: {0: 0, 1: 0, 2: 0, 3: 0, 4: 0},
            }
        */

        for(int j = 0; j < arr.length; j++) { // Zeilen (3)
            for (int k = 0; k < arr[j].length; k++) { // Zellen (4)
                System.out.print(arr[j][k]);
            }
            System.out.println();
        }

        System.out.println(BREAK);

        arr = new int[3][4];

        for(int j = 0; j < arr.length; j++) { // Zeilen
            System.out.print(arr[j][0] + " ");
            System.out.print(arr[j][1] + " ");
            System.out.print(arr[j][2] + " ");
            System.out.print(arr[j][3] + " ");
            System.out.println();
        }
    }


}
