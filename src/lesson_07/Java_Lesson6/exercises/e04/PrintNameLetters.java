// Zadacha 4:
// Napishete metod, koito otpechatva na ekrana inicialite na imeto vi.
// Vuvedete imeto si ot klaviaturata.

package exercises.e04;

import java.util.Scanner;

public class PrintNameLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuvedete imena: ");
        String names = sc.nextLine();

        System.out.println(getInitials(names));
    }
    public static String getInitials(String names) {
        String initials = "";
        String[] array = names.split("[-\\s]");
        for (int i = 0; i < array.length; i++) {
            initials = initials + array[i].charAt(0);
        }
        return initials.toUpperCase();
    }
}
