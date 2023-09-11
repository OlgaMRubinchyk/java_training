package lesson_04.hometask_04;
/*Enter elements in a two-dimensional array of arbitrary dimension. Write a
        program that outputs the values of the elements in a two-dimensional array
        after it has been rotated by -90 degrees.
        Example:
        Input:
        1, 2, 3, 4
        5, 6, 7, 8
        9, 10, 11, 12
        13, 14, 15, 16
        Output:
        4, 8, 12, 16
        3, 7, 11, 15
        2, 6, 10, 14
        1, 5, 9, 13*/
public class Task14 {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        // Print Array:
        System.out.println("Array is: ");
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[0].length; column++) {
                System.out.print(array1[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Rotating the array
        System.out.println("Rotated array:");
        int[][] array2 = new int[array1.length][array1[0].length];
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                array2[row][column] = array1[column][array1.length - row - 1];
                System.out.print(array2[row][column] + " ");
            }
            System.out.println();
        }

    }
}
