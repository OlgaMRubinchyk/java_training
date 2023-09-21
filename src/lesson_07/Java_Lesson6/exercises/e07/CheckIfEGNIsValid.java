// Zadacha 7:
// e validno (samo purvite 6 cifri da se validirat) i ako e - godina, mesec i den na rajdane.

package exercises.e07;

import java.util.Scanner;

public class CheckIfEGNIsValid {
    public static void main(String[] args) {
        // 99001011010
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int year = ((input.charAt(0) - '0') * 10) + (input.charAt(1) - '0');
        int month = ((input.charAt(2) - '0') * 10) + (input.charAt(3) - '0');
        int day = ((input.charAt(4) - '0') * 10) + (input.charAt(5) - '0');
        if (month > 12 || month == 0) {
            System.out.println("EGN ne e validno");
        }
        if (day > 31 || day == 0) {
            System.out.println("Not valid date");
        } else {
            System.out.println("correct");
        }
    }
    public static void checkIfEGNIsCorrect() {
        // [0-9]{2}[01]{1}[0-9
    }
}
