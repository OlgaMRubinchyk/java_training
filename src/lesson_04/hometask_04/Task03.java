package lesson_04.hometask_04;

import java.util.Scanner;

/*Write a program that accepts two integers from the user.
        Then create an array with 10 elements in the following way:
        - The first 2 elements of the array are the entered number.
        - Each subsequent element of the array is equal to the sum of the
        previous 2 elements in the array and if the index is:
        o even multiply the sum by 3
        o odd divide the sum by 2
        Example:
        Input:
        Example 1: 1
        Example 2: 3
        Output:
        Example 1: [1, 1, 6, 3, 27, 15, 126, 70, 588, 329]
        Example 2: [3, 3, 18, 10, 84, 47, 393, 220, 1839, 1029]*/
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first element of array: ");
        int arr1 = sc.nextInt();
        System.out.print("Please enter second element of array: ");
        int arr2 = sc.nextInt();
        System.out.println();

        int[] array1 = new int[10];
        // Assigning first two elements of array to entered numbers
        array1[0] = arr1;
        array1[1] = arr2;

        // Calculating other elements of array:
        for (int index = 2; index < array1.length; index++) {
            if (index % 2 == 0) {
                array1[index] = (array1[index - 1] + array1[index - 2]) * 3;
            } else {
                array1[index] = (array1[index - 1] + array1[index - 2]) / 2;
            }
        }

        System.out.println("The array is:");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }
    }
}
