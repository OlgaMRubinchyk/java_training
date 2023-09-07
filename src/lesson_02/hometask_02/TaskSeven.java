package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 7
        // User inputs two natural 2-digit natural numbers
        System.out.println("Task 7:");
        System.out.println("Please enter first 2-digit natural number [10 - 99]: A = ");
        int a = sc.nextInt();
        System.out.println("Please enter second 2-digit natural number [10 - 99]: B = ");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("C = A * B = " + c);
        // Check if c is an even number
        if ((c % 2) == 0) {
            System.out.println("C is even.");
        }
        else {
            System.out.println("C is odd.");
        }

        // Check if last digit of C is divisible by 3
        // Separate last digit:
        int lastDigit = c % 10;
        // Check if lastDigit is divisible by 3
        if ((lastDigit % 3) == 0) {
            System.out.println(lastDigit + " is divisible by 3");
        }
        else {
            System.out.println(lastDigit + " is NOT divisible by 3");
        }

    }
}
