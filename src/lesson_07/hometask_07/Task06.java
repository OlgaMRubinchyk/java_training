package lesson_07.hometask_07;

import java.util.Arrays;

/*Write a method that checks whether a character string is an anagram (contains
        the same characters, but not necessarily in the same order) of another string.
        Check only English letters.
        Example:
        Input:
        anagram and aaangmr
        Output:
        true*/
public class Task06 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "aaangmra"));

    }

    public static boolean isAnagram(String s1, String s2) {
        char s1Array[] = s1.toCharArray();
        char s2Array[] = s2.toCharArray();
        if (s1.length() != s2.length()) {
            return false;
        }
        // sort both strings in ascending order and compare sorted strings
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);

        }
}
