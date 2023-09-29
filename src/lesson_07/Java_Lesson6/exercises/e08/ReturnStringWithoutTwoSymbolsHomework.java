// Zadacha 8:
// Napishete metod, koito da prochete vuveden ot potrebitelq string. Metoda
// trqbva da vurne string bez purvite 2 simvola. Zapazvate purviq simvol ako
// e "g" i zapazvate vtoriq ako e "h".

// The given string is: goat
// The new string is: gat

// The given string is: photo
// The new string is: hoto

// The given string is: ghost
// The new string is: ghost

package exercises.e08;

public class ReturnStringWithoutTwoSymbolsHomework {
    public static void main(String[] args) {
        String word = "goat";
        String result = stringCutter(word);
        System.out.println(result);
    }
    public static String stringCutter(String word) {
        String temp = "";
        String shortenedWord = "";
        if (word.charAt(0) != 'g' && word.charAt(1) != 'h') {
            shortenedWord = word.substring(2);
        }
        if (word.charAt(0) == 'g' && word.charAt(1) == 'h') {
            shortenedWord = word;
        }
        if (word.charAt(0) == 'g' && word.charAt(1) != 'h') {
            temp = word.substring(0,1);
            shortenedWord = temp + word.substring(2);
        }
        if (word.charAt(0) != 'g' && word.charAt(1) == 'h') {
            shortenedWord = word.substring(1);
        }
        return shortenedWord;
    }
}
