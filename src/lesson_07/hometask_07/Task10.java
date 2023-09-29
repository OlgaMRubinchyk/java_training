package lesson_07.hometask_07;

import java.util.Scanner;

/*Write a method to read a string entered by the user. The method should check if
        the input string contains a "lucky character". A symbol is "lucky" when the same
        symbol is to the left or right of it.
        Example:
        Input:
        azzlea
        azmzlea
        Output:
        True
        False*/
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String inputString = sc.next();

        System.out.println("The string is lucky: " + stringIsLucky(inputString));

    }

    public static boolean stringIsLucky (String input) {
        boolean isLucky = false;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                isLucky = true;
            }
        }
        return isLucky;
    }
}
