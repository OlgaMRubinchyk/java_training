package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        To read a positive number entered by the user.
        The program to determine whether the number is prime.
        Note: What is a prime number? Number that is divisible only by 1 and itself.*/
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Number is not positive :)");
            return;
        }

        if (number == 1 || number == 2) {
            System.out.println("Number is prime!");
            return;
        }

        for (int index = 2; index < number / 2; index++) {
            if (number % index == 0) {
                System.out.println("Number is NOT prime!");
                return;
            }
        }
        System.out.println("Number is prime!" );
   }
}
