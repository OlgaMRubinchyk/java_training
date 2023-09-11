package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        The program must accept (by the user) a number N from the interval [10-30000].
        The program to check if the number entered is a palindrome.
        Note: What is a palindrome? A palindrome is a number that is read the same
        way front to back and back to front. Example: The number 28682 is a
        palindrome.*/

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number N from the interval [10-30000]:");
        int number = sc.nextInt();

        if (number < 10 || number > 30000) {
            System.err.println("Number is not in interval [10-30000].");
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

        int reversedRightSide = 0;

        for (int index = 1; index <= numberOfDigits / 2; index++) {
            int tmp = number % 10;
            reversedRightSide = reversedRightSide * 10 + tmp;
            number = number / 10;
        }

        if (numberOfDigits % 2 !=0) {
            number = number / 10;
        }

        System.out.println("Reversed Right Side is " + reversedRightSide);
        System.out.println("Left Side is " + number);

        if (reversedRightSide == number) {
            System.out.println("It's palindrome.");
        } else {
            System.out.println("It's NOT palindrome.");
        }

    }
}
