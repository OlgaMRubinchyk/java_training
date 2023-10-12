package lesson_13;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        // user enters text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user's text: ");
        String userText = scanner.nextLine();

        Map<Character, ArrayList<Integer>> map = new HashMap<>();
        // search in the userText
        for (int i = 0; i < userText.length(); i++) {
            char letter = userText.charAt(i);
            if (letter == ' ') { // skip space in the user's input
                continue;
            }
            if (map.get(letter) == null) {
                map.put(letter, new ArrayList<>(Arrays.asList(i)));
            } else {
                map.get(letter).add(i);
            }

        }

        System.out.println(map.toString());
    }
}
