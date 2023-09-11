package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 9
        // User inputs integer number A
        System.out.println("Task 9:");
        System.out.println("Please enter integer A in the range [0 - 100]: ");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("It will not rain.");
            return;
        }
        else if ((a > 0) && (a <= 5)) {
            System.out.println("Minimal chance of precipitation.");
            return;
        }
        else if ((a > 5) && (a <= 20)) {
            System.out.println("A small chance of precipitation.");
            return;
        }
        else if ((a > 20) && (a <= 50)) {
            System.out.println("There is a chance of precipitation.");
            return;
        }
        else if ((a > 50) && (a <= 80)) {
            System.out.println("High chance of precipitation.");
            return;
        }
        else if ((a > 80) && (a <= 100)) {
            System.out.println("It will rain.");
            return;
        }
        else {
            System.out.println("You have entered an invalid number.");
        }

    }

}
