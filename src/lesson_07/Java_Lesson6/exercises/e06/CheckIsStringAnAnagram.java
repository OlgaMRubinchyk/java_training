// Zadacha 6:
// Napishete metod, koito proverqva dali daden simvolen niz e anagrama (sudurja sushtite simvoli),
// no ne zaduljitelno v sushtiq red) na drug simvolen niz. Proverqvaite samo angliiskite bukvi.

package exercises.e06;

import java.util.Arrays;

public class CheckIsStringAnAnagram {
    public static void main(String[] args) {
        String str1 = "anagrama";
        String str2 = "aaaangmr";
        boolean result = checkTwoStrings(str1,str2);
        System.out.println(result);
    }

    public static boolean checkTwoStrings(String str1, String str2) {
        // Creating char[] arrays
        char[] ch1 = new char[str1.length()];
        char[] ch2 = new char[str2.length()];

        // Get lengths of both arrays
        int length1 = ch1.length;
        int length2 = ch2.length;

        // If length is not the same, strings are not anagrams
        if (length1 != length2) {
            return false;
        }

        // Fill in the arrays
        for (int i = 0; i < length1; i++) {
            ch1[i] = str1.charAt(i);
            ch2[i] = str2.charAt(i);
        }

        // Sort both arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare the sorted arrays
        for (int i = 0; i <length1; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
