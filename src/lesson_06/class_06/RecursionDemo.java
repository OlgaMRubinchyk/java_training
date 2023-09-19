package lesson_06.class_06;

public class RecursionDemo {
    // Recursion in java is a process when method calls itself continuously
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    // 10 + 9 + 8 + ... + 1
    public static int sum(int number) {
        // condition
        if (number > 0) {
            return number + sum(number - 1);
        }
        // bottom
        return 0;
    }
}
