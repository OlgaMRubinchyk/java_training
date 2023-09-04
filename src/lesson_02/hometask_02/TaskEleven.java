package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 11
        // User inputs 3-digit natural number
        System.out.println("Task 11:");
        System.out.println("Please enter 3-digit natural number [100 - 999]: A = ");
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

        // Check if all three digits are equal
        if ((digit1 == digit2) && (digit1 == digit3)) {
            System.out.println("The numbers are equal.");
        }
        else if ((digit1 > digit2) && (digit2 > digit3)) {
            System.out.println("Descending order.");
        }
        else if ((digit1 < digit2) && (digit2 < digit3)) {
            System.out.println("Ascending order.");
        }
        else {
            System.out.println("Try with another number.");
        }

    }
}
