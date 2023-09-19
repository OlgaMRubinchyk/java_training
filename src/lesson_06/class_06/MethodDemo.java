package lesson_06.class_06;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myArr1 = {1, 2, 3};
        int[] myArr2 = {8, 9, 10};

        printArray(myArr);

        System.out.println("\n\n" + Arrays.toString(multiplyArrays(myArr1, myArr2)));
    }

    public static void printArray(int[] myarr) {
        System.out.print("[");
        for (int number : myarr) {
            System.out.print(number + " ");
        }
        System.out.print("]");
    }

    public static long[] multiplyArrays(int[] ar1, int[] ar2) {
        // do the validation
        long[] result = new long[ar1.length];

        for (int i = 0; i < ar1.length; i++) {
            result[i] = ar1[i] * ar2[i];
        }
        return result;
    }
}
