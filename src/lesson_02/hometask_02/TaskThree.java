package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        // Task 3
        // User inputs integer numbers A, B
        System.out.println("Task 3:");
        System.out.println("Please enter A: ");
        float a = sc.nextFloat();
        System.out.println("Please enter B: ");
        float b = sc.nextFloat();

        if (a >= b) {
            System.out.println("In ascending order: " + b + ", " + a);
            System.out.println("In descending order: " + a + ", " + b);
        }
        else {
            System.out.println("In ascending order: " + a + ", " + b);
            System.out.println("In descending order: " + b + ", " + a);
        }

    }
}