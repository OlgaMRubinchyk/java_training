package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        To read a positive integer entered by the user.
        Display the sum of all numbers between 1 and the entered number.
        Example:
        Input:
        12
        Output:
        The sum of all numbers to 12 is = 78.*/

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Number is not positive :)");
            return;
        }
        int sum = 0;

        for (int index = 1; index <= number; index ++) {
            sum = sum + index;
        }

        System.out.println("Sum of all numbers between 1 and " + number + " is " + sum);

    }
}
