package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        To read two different integers entered by the user.
        Display all the numbers in the interval.
        Example:
        Input:
        17, 30
        Output:
        17 18 19 20 21 22 23 24 25 26 27 28 29 30*/
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first integer:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second integer:");
        int secondNumber = sc.nextInt();

        if (firstNumber <= secondNumber) {
            for (int index = firstNumber; index <= secondNumber; index ++) {
                System.out.print(index + " ");
            }
        } else {
            for (int index = secondNumber; index <= firstNumber; index ++) {
                System.out.print(index + " ");
            }
        }

    }
}
