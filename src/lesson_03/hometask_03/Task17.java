package lesson_03.hometask_03;

import java.util.Scanner;
/*Write a program that accepts a positive number N (entered by the user).
        The program to calculate the value of N! (N factorial).
        Example:
        Input:
        4
        Calculations:
        4! = 1*2*3*4 = 24
        Output:
        24*/
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        long number = sc.nextLong();

        if (number <= 0) {
            System.err.println("Number is not positive :)");
            return;
        }

        long f = 1;
        for (int index = 1; index <= number; index ++) {
            f = f * index;
        }
        System.out.println(number + "! = " + f);
    }
}
