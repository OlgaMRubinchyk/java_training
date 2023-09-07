package lesson_03.hometask_03;

import java.util.Scanner;
/*
Write a program that accepts (by the user) a natural number N from the interval
        [10-300].
        The program should display in reverse order all the numbers that are multiples
        of 7 and are smaller than N.
*/
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integer [10 - 300]:");
        int number = sc.nextInt();

        if (number < 10 || number >= 301) {
            System.err.println("Number is not in interval [10 - 300]");
            return;
        }

        for (int index = number; index >= 10; index--) {
            if (index % 7 == 0) {
                System.out.println(index);
            }
        }

    }
}
