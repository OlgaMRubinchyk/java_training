package lesson_06.class_06;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 87, 0, 15, 65, 2, 98, -4, 5};
        //int[] arr = {-4, 0, 2, 5, 12, 15, 65, 87, 98};
        System.out.println(Arrays.toString(bubbleSortOptimization(arr)));
    }

    public static int[] bubbleSort(int[] myArr) {
        int countAllIterations = 0;
        for (int index = 0; index < myArr.length; index++) {
            int iterations = 0;
            for (int inner = 0; inner < myArr.length - 1; inner++) {
                iterations++;
                if (myArr[inner] > myArr[inner + 1]) {
                    int temp = myArr[inner];
                    myArr[inner] = myArr[inner + 1];
                    myArr[inner + 1] = temp;
                }
            }
            countAllIterations+=iterations;
        }
        System.out.println("Iterations: " + countAllIterations);
        return myArr;
    }

    public static int[] bubbleSortOptimization(int[] myArr) {
        int countAllIterations = 0;

        for (int index = 0; index < myArr.length; index++) {
            boolean hasSwap = false;

            for (int inner = 0; inner < myArr.length - 1 - index; inner++) {
                countAllIterations++;
                if (myArr[inner] > myArr[inner + 1]) {
                    int temp = myArr[inner];
                    myArr[inner] = myArr[inner + 1];
                    myArr[inner + 1] = temp;
                    hasSwap = true;
                }
            }
            if (!hasSwap) {
                break;
            }
        }
        System.out.println("Iterations: " + countAllIterations);
        return myArr;
    }
}
