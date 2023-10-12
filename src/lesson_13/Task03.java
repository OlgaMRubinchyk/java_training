package lesson_13;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        // user enters text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user's text: ");
        String userText = scanner.nextLine();
        userText = userText.toUpperCase();

        Map<Character, Integer> map = new HashMap<>();
        // search in the userText
        Integer numberOfLetters = 0;
        for (int i = 0; i < userText.length(); i++) {
            char letter = userText.charAt(i);
            if ((letter < 'A') || (letter > 'Z')) { // not letters
                continue;
            }
            if (map.get(letter) == null) {
                map.put(letter, 1);
            } else {
                map.put(letter, map.get(letter) + 1);
            }
            numberOfLetters++; // without spaces and other characters
        }
        System.out.println("Number of letters only: " + numberOfLetters);
        System.out.println("Most common letters:");


        for (Map.Entry entry: map.entrySet()) {
            int letterPercentage = ((int) entry.getValue() * 100 / numberOfLetters);
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
            for (int i = 0; i < letterPercentage; i++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
