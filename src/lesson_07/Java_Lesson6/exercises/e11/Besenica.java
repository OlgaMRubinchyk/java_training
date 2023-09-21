// Zadacha 11: Realiziraite igrata "Besenica" - za taina duma, potrebitelqt trqbva da vuvejda
// bukva, sled koeto da se otpechatva dumata, v koqto sa pokazani otgatnatite bukvi, a na
// mqstoto na neotgatnatite ima _. Sushto taka potrebitelqt trqbva da znae kolko opita
// mu ostavat.
// Maks broi opiti - 10.

package exercises.e11;

import java.util.Scanner;

public class Besenica {
    public static void main(String[] args) {
        int tries = 10;
        String word = "Pazardjik";

        // Convert the String into an Array
        char[] array = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            array[i] = word.charAt(i);
        }

        // Create a second Array
        char[] hiddenArray = new char[array.length];
        for (int i = 0; i < word.length(); i++) {
            array[i] = '_';
        }

        while (tries > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Otgatnete dumata:");
            for (int i = 0; i < hiddenArray.length; i++) {
                System.out.print(array[i]);
            }
            String letter = sc.nextLine();
            // Convert the String into an Array
            char[] letterArray = new char[word.length()];
            for (int i = 0; i < letter.length(); i++) {
                letterArray[i] = letter.charAt(i);
                System.out.println(letterArray[i]);
            }
            for (int i = 0; i < word.length(); i++) {
                if (letterArray[i] == array[i]) {
                    for (int j = 0; j < hiddenArray.length; j++) {
                        if (hiddenArray[i] == letterArray[i]) {
                            hiddenArray[i] = letterArray[i];
                        }
                    }
                }
            }
            tries--;
            System.out.println("Tazi bukva ne e namerena");
            System.out.println("Ostavat ti oshte " + tries + " opita!");
        }
    }
}
