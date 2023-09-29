package lesson_05.hometask_05;

import java.util.regex.Pattern;

/*Write a Java program to remove the specific letters from a string and return the
        new string. Specific letters: "p", "q", or "r".*/
public class Task10 {
    public static void main(String[] args) {
        String s1 = "pqrqg"; // initial string
        System.out.println(s1);
        System.out.println(Pattern.matches("[p|q|r]+", s1));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            if (char1 == 'p' || char1 == 'q' || char1 == 'r') {
                continue;
            }
            result.append(char1);
        }


        System.out.println(result);
    }
}
