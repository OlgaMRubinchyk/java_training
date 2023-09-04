package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 6
        // User inputs 4-digit natural number [1000 - 9999]
        System.out.println("Task 6:");
        System.out.println("Please enter 4-digit natural number [1000 - 9999]: ");
        int number = sc.nextInt();

        // Separate 4th digit:
        int digit4 = number % 10;
        // Separate 3rd digit:
        int digit3 = (number % 100)/10;
        // Separate 2nd digit:
        int digit2 = (number % 1000) / 100;
        // Separate 1st digit:
        int digit1 = number / 1000;

        System.out.println("digit1 = " + digit1);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);
        System.out.println("digit4 = " + digit4);

        // Form first number using digit1 and digit4
        int number1 = digit1 * 10 + digit4;
        // Form second number using digit2 and digit3
        int number2 = digit2 * 10 + digit3;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        // Compare number1 and number2
        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        }
        else if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        }
        else {
            System.out.println(number1 + " = " + number2);
        }

    }
}
