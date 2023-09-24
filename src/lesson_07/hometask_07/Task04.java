package lesson_07.hometask_07;

import java.util.Scanner;

/*Write a method that prints your initials to the screen. Enter your name from the
        keyboard.
        Example:
        Input:
        Bruce Wayne
        Output:
        BW*/
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and last name:");
        String inputString = sc.nextLine();

        takeInitials(inputString);
    }

    public static void takeInitials(String input) {
        String nameFirstLetter = input.substring(0,1).toUpperCase();
        String lastNameFirstLetter = "";
        System.out.print(nameFirstLetter);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                lastNameFirstLetter = (lastNameFirstLetter + input.charAt(i + 1)).toUpperCase();
                            }
        }
        System.out.println(lastNameFirstLetter);
    }

}
