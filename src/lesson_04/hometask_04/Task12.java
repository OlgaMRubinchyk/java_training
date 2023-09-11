package lesson_04.hometask_04;
/*
You have a 7x7 two-dimensional array of natural numbers whose values are preentered. Write a program that finds and print in the console the smallest and the
        largest element from this array.
        Example:
        Input:
        48,72,13,14,15,43,19
        21,22,53,24,75,48,17
        31,57,33,34,35,63,12
        41,95,43,44,45,91,50
        59,52,53,54,55,14,32
        61,69,63,64,65,81,15
        42,32,12,26,59,67,97
        Output:
        The smallest number is: 12
        The largest number is: 97
*/
public class Task12 {
    public static void main(String[] args) {
        int[][] array1 = {
                {48,72,13,14,15,43,19},
                {21,22,53,24,75,48,17},
                {31,57,33,34,35,63,12},
                {41,95,43,44,45,91,50},
                {59,52,53,54,55,14,32},
                {61,69,63,64,65,81,15},
                {42,32,12,26,59,67,97}
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

        // Finding smallest and largest elements of array
        int smallest = array1[0][0];
        int largest = array1[0][0];
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[0].length; column++) {
                if (array1[row][column] < smallest) {
                    smallest = array1[row][column];
                }
                if (array1[row][column] > largest) {
                    largest = array1[row][column];
                }
            }
        }

        System.out.println("The largest element is " + largest);
        System.out.println("The smallest element is " + smallest);
    }
}
