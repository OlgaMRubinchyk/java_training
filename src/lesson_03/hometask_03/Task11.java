package lesson_03.hometask_03;

import java.util.Scanner;

/*Write a program that should do the following:
        To read a positive number (n) entered by the user.
        As result print a triangle with height equal to n.
        Example:
        Input:
        4
        Output:
            *
           ***
          *****
         *******/
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive integer:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Number is not positive :)");
            return;
        }

        int numberOfStars = 1;
        int numberOfSpaces = number - 1;

        for (int index = 1; index <= number; index ++) {
            for (int i = 1; i <= numberOfSpaces; i++) {
                System.out.print(" ");
            }
            //System.out.println();
            for (int index2 = 1; index2 <= numberOfStars; index2++) {
                System.out.print("*");
            }
            System.out.println();
            numberOfStars = numberOfStars + 2;
            numberOfSpaces--;
        }
    }
}
