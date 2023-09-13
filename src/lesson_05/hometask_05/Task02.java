package lesson_05.hometask_05;
/*Write a program where the user must enter two strings.
        - The program to check which of the two strings is longer.
        - The program to print the length of the two strings.
        Example:
        Input:
        short, longString
        Output:
        The longest string is: longString
        short – 5, longString - 10*/
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input first string:");
        String s1 = sc.next();
        System.out.println("Please input second string:");
        String s2 = sc.next();

        System.out.println("Length of " + s1 + " is " + s1.length());
        System.out.println("Length of " + s2 + " is " + s2.length());

        // compare length of two strings
        if (s1.length() > s2.length()) {
            System.out.println("The longest string is " + s1);
        }
        if (s2.length() > s1.length()) {
            System.out.println("The longest string is " + s2);
        }
        if (s1.length() == s2.length()) {
            System.out.println("The length of both strings are equal.");
        }
    }
}
