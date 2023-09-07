package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        To read a positive integer (n) entered by the user.
        Display the first n number of numbers that are divisible by 3.
        Example:
        Input:
        9
        Output:
        3, 6, 9, 12, 15, 18, 21, 24, 27*/

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Number is not positive :)");
            return;
        }
        int firstNum = 3;
        System.out.println(firstNum + " ");

        for (int index = 2; index <= number; index ++) {
            firstNum = firstNum + 3;
            System.out.println(firstNum + " ");;
        }



    }
}
