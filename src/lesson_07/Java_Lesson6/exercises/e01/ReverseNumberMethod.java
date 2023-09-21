// Zadacha 1:
// Napishete metod, koito da oburne chislo. Za celta izpolzvaite rekursiq

package exercises.e01;

public class ReverseNumberMethod {
    public static void main(String[] args) {
        int number = 2743;
        System.out.println(reverseNumber(number,0));
    }
    public static int reverseNumber(int number, int result) {
        if (number > 0) {   // condition
            int temp = number % 10; // get the last number
            result = temp + result * 10;    // save the new number
            return reverseNumber(number / 10, result); // recursive call
        }
        return result;  // bottom
    }
}
