package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 2
        // User inputs integer numbers A, B
        System.out.println("Task 2:");
        System.out.println("Please enter integer A: ");
        int a = sc.nextInt();
        System.out.println("Please enter integer B: ");
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int remainder = a % b;
        int division = a / b;

        System.out.println("A + B = " + sum);
        System.out.println("A - B = " + diff);
        System.out.println("A * B = " + product);
        System.out.println("A % B = " + remainder);
        System.out.println("A / B = " + division);

        // User inputs floating numbers A, B
        System.out.println("Please enter floating A: ");
        float a1 = sc.nextFloat();
        System.out.println("Please enter floating B: ");
        float b1 = sc.nextFloat();

        float sum1 = a1 + b1;
        float diff1 = a1 - b1;
        float product1 = a1 * b1;
        float remainder1 = a1 % b1;
        float division1 = a1 / b1;

        System.out.println("A + B = " + sum1);
        System.out.println("A - B = " + diff1);
        System.out.println("A * B = " + product1);
        System.out.println("A % B = " + remainder1);
        System.out.println("A / B = " + division1);

    }

}