package lesson_05.hometask_05;

import java.util.Scanner;

/*
Write a program that accepts two integers from the user.
        The program calls the getTotal() method, which takes two integers and returns
        their sum.
        Store the result in a variable and print to the console.
*/
public class Task07 {
    static int getTotal(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        int result = getTotal(firstNumber, secondNumber);
        System.out.println("The sum is " + result);

    }
}
