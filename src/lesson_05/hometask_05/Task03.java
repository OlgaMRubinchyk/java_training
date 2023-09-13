package lesson_05.hometask_05;
/*Write a program where the user must enter two strings.
        The program should merge the two strings and print the newly obtained one.
        Example:
        Input:
        Hello to; Java world
        Output:
        Hello to Java world*/
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input first string:");
        String s1 = sc.next();
        System.out.println("Please input second string:");
        String s2 = sc.next();

        String newString = s1.concat(s2);
        System.out.println(newString);
    }
}
