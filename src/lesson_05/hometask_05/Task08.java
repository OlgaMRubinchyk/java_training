package lesson_05.hometask_05;

import java.util.Scanner;
/*
Write a program that accepts a single integer from the user.
        The program calls the isOdd() method, which accepts an integer and returns a
        boolean value.
        The method to return true if the entered number is odd and false if it is even.
        Store the result in a variable and print to the console with an appropriate
        message.
*/
public class Task08 {
    static boolean isOdd(int num) {
            return (num % 2 != 0);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        boolean result = isOdd(number);
        System.out.println("The number is odd: " + result);

    }
}
