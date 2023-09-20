package lesson_07.class_07;
/*Write a method to reverse a number. To do this, use a recursion.
        Example:
        Input:
        2854
        Output:
        4582*/
public class Task01 {
    public static void main(String[] args) {
        int a = 2854;
        System.out.println(makeRecursion(a, 0));
    }

    public static int makeRecursion(int a, int result) {
        System.out.println("...." + a + " result: " + result);
        // condition
        if (a > 0) {
            int lastDigit = a % 10; // 4   5    8    2
            result = result * 10 + lastDigit; // 0 + 4 = 4;   45    458    4582
            // recursive call + update
            return makeRecursion(a/10, result); // 285   28    2
        }

        System.out.println("end!");
        return result; // bottom
    }

}
