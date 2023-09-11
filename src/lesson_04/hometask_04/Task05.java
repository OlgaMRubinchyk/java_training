package lesson_04.hometask_04;

import java.util.Scanner;
/*
Write a program that creates an array with 10 elements and initializes each of
        the elements with a value equal to the index of the element multiplied by 4. Print
        the array in the console.
        Example:
        Output:
        [0, 4, 8, 12, 16, 20, 24, 28, 32, 36]
*/

public class Task05 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        // Calculating elements of array:
        for (int index = 0; index < array1.length; index++) {
            array1[index] = index * 4;
            System.out.print(array1[index] + " ");
        }
    }
}
