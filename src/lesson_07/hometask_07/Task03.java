package lesson_07.hometask_07;
/*Write a method to reverse a string. Using recursion.
        Example:
        Input:
        word
        Output:
        drow*/
public class Task03 {
        public static void main(String[] args) {
        String s1 = "asdfgh";
        System.out.println(reverseString(s1));
            }

    public static String reverseString(String input) {
        if (input.length() == 1) {
            return input;
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}
