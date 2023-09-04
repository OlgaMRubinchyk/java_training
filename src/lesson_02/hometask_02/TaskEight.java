package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 8
        // User inputs 3-digit number
        System.out.println("Task 8:");
        System.out.println("Please enter 3-digit number not containing '0' [111 - 999]: A = ");
        int a = sc.nextInt();

        // Separate 3rd digit:
        int digit3 = a % 10;
        // Separate 2nd digit:
        int digit2 = ((a - digit3) % 100) / 10;
        // Separate 1st digit:
        int digit1 = ((a - digit3 - (digit2 * 10)) / 100);

        System.out.println("digit1 = " + digit1);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);

        // Check if number A is divisible by digit1
        if ((a % digit1) == 0) {
            System.out.println(a + " is divisible by " + digit1);
        }
        else {
            System.out.println(a + " is NOT divisible by " + digit1);
        }
        // Check if number A is divisible by digit2
        if ((a % digit2) == 0) {
            System.out.println(a + " is divisible by " + digit2);
        }
        else {
            System.out.println(a + " is NOT divisible by " + digit2);
        }
        // Check if number A is divisible by digit3
        if ((a % digit3) == 0) {
            System.out.println(a + " is divisible by " + digit3);
        }
        else {
            System.out.println(a + " is NOT divisible by " + digit3);
        }

    }
}
