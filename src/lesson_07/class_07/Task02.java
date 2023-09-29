package lesson_07.class_07;
/*Write a method to output the factorial of a number entered by the user. Use
        recursion.
        Example:
        Input:
        5
        Output:
        120*/
public class Task02 {
    public static void main(String[] args) {
        int input = 5;
        System.out.println(factorial(input));
    }


    public static long factorial(int number) {
        if (number == 0 || number == 1) { // exit condition
            return 1;
        }
        return (factorial(number - 1) * number);
    }
}
