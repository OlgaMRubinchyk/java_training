package lesson_03.hometask_03;

import java.util.Scanner;
/*Write a program that should do the following:
        - To read a char from the keyboard.
        - If Y / y char is entered, the program must print "Yes" in the console
        - When N / n char is entered, the program must print "No" in the console
        - Use Switch state*/
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Y or y or N or n");
        String ch = sc.nextLine();

        String result = switch (ch) {
            case "Y" :
            case "y":
                yield "Yes";
            case "N":
            case "n":
                yield "No";
            default:
                yield "Wrong char entered!";
        };
        System.out.println(result);

    }
}
