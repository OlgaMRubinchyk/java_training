package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        The program must accept (by the user) a number N from the interval [1-10000].
        The program to reverse the number entered by the user and prints it in the
        console.
        Example:
        Input:
        4289
        Output:
        9824*/

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number N from the interval [1-10000]:");
        int number = sc.nextInt();

        if (number < 1 || number > 10000) {
            System.err.println("Number is not in interval [1-10000].");
            return;
        }

        // Calculate number of digits in the entered number
        int additionalNumber = number;
        int numberOfDigits = 0;

        while (additionalNumber != 0) {
            additionalNumber = additionalNumber / 10;
            numberOfDigits++;
        }
        System.out.println("Number of Digits: " + numberOfDigits);
        System.out.println("Reversed number:");

        for (int index = 1; index <= numberOfDigits; index++) {
            int digit = number % 10;
            number = number / 10;
            System.out.print(digit);
        }

    }
}
