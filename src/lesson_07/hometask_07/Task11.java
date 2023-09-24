package lesson_07.hometask_07;

import java.util.Scanner;

/*Implement the game "Hangman" - for a secret word, the user must enter a letter,
        then the word is printed, in which the guessed letters are shown, and _ is in
        place of the unguessed ones. Also, the user needs to know how many attempts
        he has left. Max number of attempts - 10*/
public class Task11 {
    public static void main(String[] args) {
        String s1 = "Hangman";
        gameHangman(s1);

    }

    public static void gameHangman(String input) {
        //input.length();
        String s2 = new String(new char[input.length()]).replace('\0', '_');
        System.out.println(s2);
        int numberOfAttempts = 3;

        while (numberOfAttempts > 0) {
            Scanner sc = new Scanner(System.in);
            String guess = sc.next();
            if (guess.length() != 1) {
                System.err.println("Please enter 1 character.");
                continue;
            }
            if (!input.contains(guess)) {
                //System.out.println(input.indexOf(guess));
                numberOfAttempts--;
                continue;
            }
            // if input.contains(guess)
            s2 = s2.substring(0, input.indexOf(guess)).concat(guess).concat(s2.substring(input.indexOf(guess) + 1));
            System.out.println(s2);
            numberOfAttempts--;
            System.out.println("You have " + numberOfAttempts + " attempts left.");

        }
        System.out.println("No attempts left.");


    }

}
