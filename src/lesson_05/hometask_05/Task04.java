package lesson_05.hometask_05;
/*
Write a program where the user must enter a string of several words separated
        by a space.
        To print the entered string, but the first letters of the individual words should be
        uppercase, the rest should be lowercase.
        Example:
        Input:
        mY tEsT stRinG
        Output:
        My Test String
*/

public class Task04 {
    public static void main(String[] args) {
        String s1 = "test sTRing fRom oLg a"; // initial string
        System.out.println(s1);
        s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();

        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                //s1 = s1.substring(0, i) + s1.charAt(i) + s1.substring(i+1, i+2).toUpperCase() + s1.substring(i+2);
                s1 = s1.substring(0, i).concat(" ").concat(s1.substring(i+1, i+2).toUpperCase()).concat(s1.substring(i+2));
            }
        }
        System.out.println(s1);
    }
}
