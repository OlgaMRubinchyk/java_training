// Zadacha 2:
// Napishete metod, koito da izvede faktoriel na vuveden ot potrebitelq chislo
// Za celta izpolzvaite rekursiq

package exercises.e02;

import java.util.Scanner;

public class FactorielOfEnteredNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuvedete chislo:");
        long number = sc.nextInt();
        System.out.println(calculateFactorial(number));
    }
    public static long calculateFactorial(long number) {
        if (number >= 1) {
            return number * calculateFactorial(number - 1);
        }
        return 1;
    }
}
