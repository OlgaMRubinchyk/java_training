package lesson_04.hometask_04;
/*You have a square two-dimensional array of natural numbers whose values are
        entered from the console (by the user). The program should print the sum of
        each of the diagonals of the array.
        Example:
        Input:
        1, 4, 6, 3
        5, 9, 7, 2
        4, 8, 1, 9
        2, 3, 4, 5
        Output:
        The main diagonal sum is: 16
        The second diagonal sum is: 20*/

public class Task13 {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 4, 6, 3},
                {5, 9, 7, 2},
                {4, 8, 1, 9},
                {2, 3, 4, 5}
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

        // Finding the sum of each diagonal
        int mainDiagSum = 0;
        int secondDiagSum = 0;
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                if (row == column) {
                    mainDiagSum = mainDiagSum + array1[row][column];
                }
                if (row == (array1[row].length - 1 - column)) {
                    secondDiagSum = secondDiagSum + array1[row][column];
                }
            }
        }

        System.out.println("The main diagonal sum is " + mainDiagSum);
        System.out.println("The second diagonal sum is " + secondDiagSum);
    }
}
