package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        To read a natural numbers entered by the user.
        When number 0 is entered, the program should stop reading more numbers
        from the console.
        To output the smallest and largest number of all entered numbers.*/
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int max = number;
        int min = number;

        while (true) {
            System.out.println("Please enter natural number:");
            number = sc.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Number is not natural.");
                continue;
            }

            if (number > max) {
                max = number;
            }
            if (number < min || min < 0) {
                min = number;
            }
        }

        System.out.println("Largest number is " + max);
        System.out.println("Smallest number is " + min);

    }
}
