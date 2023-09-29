package lesson_05.hometask_05;
/*Write a method where the user enters a string that can contain lowercase and
        uppercase letters.
        The size of the string should not be greater than 50.
        Print to the console the entered string, but in uppercase letters.
        Print to the console the entered string, but in lowercase letters.
        Example:
        Input:
        Hello Java
        Output:
        HELLO JAVA, hello java*/
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string with length <= 50:");
        String s1 = sc.next();

        if (s1.length() > 50) {
            System.err.println("Length is > 50");
            return;
        }
        System.out.println(s1.toUpperCase() + ", " + s1.toLowerCase());
    }
}
