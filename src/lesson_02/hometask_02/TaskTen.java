package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 10
        // User inputs natural number A
        System.out.println("Task 10:");
        System.out.println("Please enter natural number A in the range [0 - 24]: ");
        int a = sc.nextInt();

        if ((a >= 5) && (a <= 10)) {
            System.out.println("Good morning!");
        }
        else if ((a >= 11) && (a <= 18)) {
            System.out.println("Good day!");
        }
        else if ((a >= 19) && (a <= 23)) {
            System.out.println("Good evening!");
        }
        else if ((a >= 0) && (a < 5)) {
            System.out.println("Why aren't you sleeping?");
        }
        else {
            System.out.println("You have entered an invalid number.");
        }

    }
}
