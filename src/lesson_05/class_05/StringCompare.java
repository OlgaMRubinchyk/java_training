package lesson_05.class_05;

public class StringCompare {
    public static void main(String[] args) {
        String s3 = "1234";
        String s4 = "1234";

        System.out.println(s3 == s4); //true, compares addresses

        String s5 = new String(s4);
        System.out.println("s3 = " + s3 + ", s4 = " + s4 + ", s5 = " + s5);
        System.out.println(s5 == s4); // false, compares addresses

        System.out.println(".equals: " + s5.equals(s4));

        s4 = "ABC";
        s5 = "abc";
        System.out.println(".equals: " + s5.equals(s4));
        System.out.println(".equalsIgnoreCase: " + s5.equalsIgnoreCase(s4));

        System.out.println(".compareTo: " + s5.compareTo(s4)); // number 32
        System.out.println(".compareTo: " + s4.compareTo(s5)); // number -32

        System.out.println(".compareToIgnoreCase: " + s5.compareToIgnoreCase(s4)); // number 0
        System.out.println("a".compareTo("A"));
    }
}
