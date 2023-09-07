package lesson_03.hometask_03;
/*
Write a program to output to the console the multiplication table till 10.
        Example:
        Output:
        1 * 1 = 1
        1 * 2 = 2
        …………
        10 * 10 = 100
*/
public class Task14 {
    public static void main(String[] args) {

        for (int index1 = 1; index1 <= 10; index1 ++) {
            for (int index2 = 1; index2 <= 10; index2++) {
                System.out.print(index1 + " * " + index2 + " = " + (index1 * index2));
                System.out.println();
            }
        }

    }
}
