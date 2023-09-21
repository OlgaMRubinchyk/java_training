// Zadacha 3:
// Izpolzvaiki rekursiq, napishete metod, koito da oburne String

package exercises.e03;

public class ReverseStringMethod {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseStringRecursion(str));
    }
    public static String reverseStringRecursion(String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverseStringRecursion(str.substring(1)) + str.charAt(0);
        // g
        // fg -> return reverseString(g) + f
        // efg -> return reverseString(fg) + e

//      return str.charAt(str.length() - 1) + reverseStringRecursion(str.substring(0,str.length() - 1));  // works as above
    }
}
