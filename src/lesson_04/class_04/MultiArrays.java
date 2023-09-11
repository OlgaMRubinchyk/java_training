package lesson_04.class_04;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] array2D = new int[10][20];
        int[][][] array3D = new int[10][20][30];

        int[][] arr2D = {
                {1, 2, 3}, // row1
                {4, 5, 6, 7}, // row2
                {8} // row3
        };

        int[][][] threeDimArr = {
                {{111, 112, 113}, {121, 122, 123}, {131, 132, 133}},
                {{211, 212, 213}, {221, 222, 223}, {231, 232, 233}},
                {{311, 312, 113}, {321, 322, 323}, {331, 332, 333}}
        };

        System.out.println(array2D.length); // 10 - number of rows
        System.out.println(array2D[0].length); // 20 - number of columns

        System.out.println(arr2D[0].length); // 3
        System.out.println(arr2D[1].length); // 4
        System.out.println(arr2D[2].length); // 1

        System.out.println(array3D[1][15].length); // 30

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.deepToString(threeDimArr));

    }
}
