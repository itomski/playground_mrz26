package de.lubowiecki.arrays;

public class Arrays3dTest {

    public static void main(String[] args) {

        int[][][] arr = new int[2][][]; // {null, null}
        arr[0] = new int[3][]; // {{null, null, null}, null}
        arr[1] = new int[1][]; // {{null, null, null}, {null}}
        arr[0][0] = new int[]{1,2,3}; // {{{1,2,3}, null, null}, {null}}

        arr = new int[][][]{{{2,3}, {4,5}}, {{6,7,8}}};
//        {
//            0: {
//                0: {0: 2, 1: 3},
//                1: {0: 4, 1: 5}
//            },
//            1: {
//                0: {0: 6,1: 7,2: 8}
//            }
//        };

        System.out.println(arr[1][0][2]);

        for(int i = 0, j = 10, k;   i < 100; k = i < 20 ? 100 : 200, check(i)) {
            //...
        }

    }

    public static void check(int zahl) {
        if(zahl == 200) System.out.println();
    }
}
