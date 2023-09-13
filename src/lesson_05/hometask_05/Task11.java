package lesson_05.hometask_05;
/*
Write a Java program where the user must enter a string - email.
        The program should check is this a valid email string or not – use regex.
        Display the result in the console
        olgarubinchyk@gmail.com
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input email:");
        String s1 = sc.next();

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        System.out.println("email is valid: " + Pattern.matches(regex, s1));

    }
}
