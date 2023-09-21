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
        String s1 = "qw3456erty";
        String s2 = "rty1";
        boolean isSubstring = false;

        int s1Length = s1.length();// 10
        int s2Length = s2.length();// 3

        if (s2.equals(s1.substring(s1Length - s2Length))) {
            isSubstring = true;
        }

        System.out.println(isSubstring);
    }
}
