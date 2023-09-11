package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 1
        // User inputs double numbers A, B, C
        System.out.println("Task 1:");
        System.out.println("Please enter A: ");
        double a = sc.nextDouble();
        System.out.println("Please enter B: ");
        double b = sc.nextDouble();
        System.out.println("Please enter C: ");
        double c = sc.nextDouble();

        if ((c < a) && (c < b)) {
            System.out.println("Number c = " + c + " is NOT between a = " + a + " and b = " + b);
            return;
        }


        if (((c > a) && (c < b)) || ((c < a) && (c > b))) {
            System.out.println("Number c = " + c + " is between a = " + a + " and b = " + b);
            return;
        }

        System.out.println("Number c = " + c + " is between b = " + b + " and a = " + a);


        /*else {
            System.out.println("Number c = " + c + " is NOT between a = " + a + " and b = " + b);
        }*/

    }
}