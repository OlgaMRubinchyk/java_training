package lesson_03.hometask_03;

import java.util.Scanner;

/*
Write a program that should do the following:
        The program must accept (by the user) a number N from the interval [1-30].
        Program to output the first N number of Fibonacci numbers.
        Note: Fibonacci numbers starts with 0 and 1, and each subsequent member of
        the sequence is obtained as the sum of the previous two.
        Example:
        Input:
        10
        Output:
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integer [1 - 30]:");
        int number = sc.nextInt();

        if (number <= 0 || number >= 31) {
            System.err.println("Number is not in interval [1 - 30]");
            return;
        }

        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println(number + " first Fibonacci numbers:");

        for (int index = 1; index <= number; ++index) {
            System.out.print(previousNumber + ", ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}
