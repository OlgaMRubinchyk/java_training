package lesson_02.hometask_02;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        ////// Task 5
        // User inputs integer time, floating money, boolean isAmIAtWork
        System.out.println("Task 5:");
        System.out.println("Please enter time(h) in range [0 - 24]: ");
        int time = sc.nextInt();
        if ((time > 24) || (time < 0)) {
            System.out.println("Time is invalid.");
            return;
        }
        System.out.println("Please enter money: ");
        float money = sc.nextFloat();
        if (money < 0) {
            System.out.println("Money is invalid.");
            return;
        }
        System.out.println("Are you at work? true/false: ");
        boolean isAmIAtWork = sc.nextBoolean();

        if (isAmIAtWork == true) {
            System.out.println("I'll be working and won't be able to go out.");
        }
        else if ((time >= 12) && (time <= 18) && (money >= 10)) {
            System.out.println("I will go to the cinema.");
        }
        else if ((time >= 12) && (time <= 18) && (money < 10)) {
            System.out.println("I will go for a walk.");
        }
        else if ((time > 18) && (money >= 20)) {
            System.out.println("I will go to a disco.");
        }
        else if ((time > 18) && (money < 20)) {
            System.out.println("I will go to sleep.");
        }
        else {
            System.out.println("I haven't decided yet.");
        }
    }
}
