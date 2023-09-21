// Zadacha 5:
// Napishete metod, koito broi kolko puti se sreshta vsqka angliiska bukva v daden
// simvolen niz. Zapazete rezultata v masiv

package exercises.e05;

public class CheckNumberOfOccurrenciesOfALetter {
    public static void main(String[] args) {
        String str1 = "aaabbBc ddd";
        str1 = str1.toLowerCase().replaceAll("\\W", "");
        checkOccurrences(str1);
    }
    public static int[] checkOccurrences(String str1) {
        int[] myArray = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            myArray[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i <myArray.length; i++) {
            System.out.println((char)(i + 'a') + "-" + myArray[i]);
        }
        return myArray;
    }
}
