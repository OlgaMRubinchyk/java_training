package lesson_07.hometask_07;
/*
Write a method to read 2 strings entered by the user. The method should check
        if one of the entered strings is at the end of the other (not case sensitive).
        Example:
        Input:
        qwerty and rty
        rty and querty
        Output:
        True
        True
*/
public class Task09 {
    public static void main(String[] args) {
        String s1 = "1234";
        String s2 = "qw3456erty1234";

        System.out.println(containsEnd(s1, s2));
    }

    public static boolean containsEnd (String s1, String s2) {
        int s1Length = s1.length();// 10
        int s2Length = s2.length();// 3

        if (s1Length >= s2Length) {
            if (s2.equals(s1.substring(s1Length - s2Length))) {
                return true;
            }
        } else {
            if (s1.equals(s2.substring(s2Length - s1Length))) {
                return true;
            }
        }

        return false;
    }
}
