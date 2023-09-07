package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 4
        System.out.println("Task 4:");
        // User inputs double numbers A, B, C
        System.out.println("Please enter A: ");
        double a = sc.nextDouble();
        System.out.println("Please enter B: ");
        double b = sc.nextDouble();
        System.out.println("Please enter C: ");
        double c = sc.nextDouble();

        // init d = a - extra variable
        double d = a;
        a = b;
        b = c;
        c = d;

        System.out.println("And now:");
        System.out.println("A = old B = " + a);
        System.out.println("B = old C = " + b);
        System.out.println("C = old A = " + c);
        System.out.println("Thank you!");


    }
}