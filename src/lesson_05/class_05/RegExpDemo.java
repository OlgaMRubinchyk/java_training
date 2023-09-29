package lesson_05.class_05;

import java.util.regex.Pattern;

public class RegExpDemo {
    public static void main(String[] args) {
        // ********** Kaloyan example


        //
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32")); //false, not 6
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2")); //false because of $

        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9901010001")); // true
        System.out.println(Pattern.matches("[789][0-9]{9}", "6901010001")); // false
        System.out.println(Pattern.matches("[789]+", "6901010001")); // false
        System.out.println(Pattern.matches("[789]+", "9901010001")); // false
    }
}
