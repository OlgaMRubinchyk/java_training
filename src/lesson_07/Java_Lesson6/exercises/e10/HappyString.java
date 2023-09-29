// Zadacha 10:
// Napishete metod, koito da prochete vuveden ot potrebitelq string. Metoda trqbva da
// proverqva dali vuvedeniq string sudurja "shtastliv simvol". Edin simvol e "shtastliv"
// kogato sushtiq simvol se namira ot lqvo ili ot dqsno na nego.
// The given string is: azzlea
// Is z happy in the string: true

// The given string is: azmzlea
// Is z happy in the string: false

package exercises.e10;

public class HappyString {
    public static void main(String[] args) {
        String string = "azzlea";
        System.out.println("The given string is: " + string);
        boolean result = checkIfStringIsHappy(string);
        System.out.println(result);
    }

    public static boolean checkIfStringIsHappy(String string) {
        boolean happy = false;
        char happyLetter = ' ';
        int counter = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i+1)) {
                happyLetter = string.charAt(i);
                happy = true;
            }
        }
        System.out.print("Is " + happyLetter + " happy in the string: ");
        return happy;
    }
}
