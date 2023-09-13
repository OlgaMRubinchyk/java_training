package lesson_05.hometask_05;
/*Write a program where the user must enter a single word (string).
        The program to check if the entered string is a palindrome.
        Note: Palindrome – a word that is read left-to-right and right-to-left in the same
        way.
        Example:
        Input:
        kayak
        wow
        test
        Output:
        kayak is palindrome.
        wow is palindrome.
        test is not a palindrome.*/
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string:");
        String s1 = sc.next();
        StringBuilder s2 = new StringBuilder(s1);
        s2.reverse();

        if (s1.equals(s2)) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is NOT palindrome");
        }
    }
}
