package lesson_05.hometask_05;

import java.util.Scanner;
/*
Write a program that accepts a single integer from the user (as a string).
        The program calls the factoriel() method, which accepts an integer and returns
        the factorial of the given number.
        Store the result in a variable and print to the console with an appropriate
        message.
*/
public class Task09 {
    static long factoriel(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        long factorielResult = factoriel(number);
        System.out.println("The factoriel is " + factorielResult);

    }
}
