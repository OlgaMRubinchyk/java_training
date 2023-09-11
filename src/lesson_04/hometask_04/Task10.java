package lesson_04.hometask_04;
/*A sequence of natural numbers we will call zigzag if the following conditions are
        met for its elements:
        N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
or
        N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn
        Write a program that checks whether a sequence of numbers entered into a
        one-dimensional array meet the above requirements.
        Example:
        Input:
        [1, 6, 3, 7, 2, 9, -2, 12, 5]
        [1, 2, 3, 4, 5, 6, 7, 8, 9]
        Output:
        Zigzag
        Not a Zigzag*/
public class Task10 {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 6, 3, 7, 2, 9, -2, 12, 5};
        System.out.println("Initial array is:");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }
        System.out.println();

        boolean isZigZag = true;
        for (int index = 0; index < array1.length - 1; index = index + 2) {
            if (index % 2 == 0) {
                if (!(array1[index] < array1[index + 1])) {
                    isZigZag = false;
                    break;
                }
            } else {
                if (!(array1[index] > array1[index + 1])) {
                    isZigZag = false;
                    break;
                }
            }
        }
        System.out.println("Array is ZigZag: " + isZigZag);
    }
}
