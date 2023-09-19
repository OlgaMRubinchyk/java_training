package lesson_06.class_06;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 1, 4, 3, 6, 6, 2, 4, 3, 4};
        //int[] arr = {600, 400, 300, 200, 100, 400, 300, 600, 600, 200, 400, 300, 400};
        int[] arrNeg = {6, 4, 3, 2, -1, 4, 3, -6, 6, 2, 4, 3, 4};
       /* countingSort(arr);
        System.out.println(Arrays.toString(arr));*/

        countingSortOptimized(arrNeg);
        System.out.println(Arrays.toString(arrNeg));
    }

    public static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int[] counterArr = new int[max + 1]; // 6 + 1 = 7
        //int[] counterArr = new int[max/100 + 1];
        // counterArr -> {0, 0, 0, 0, 0, 0, 0}  7 elements, all of them are 0
        System.out.println("Counter arr before: " + Arrays.toString(counterArr));

        // arr = {6, 4, 3, 2, 1, 4, 3, 6, 6, 2, 4, 3, 4};
        // counterArr -> {0, 0, 0, 0, 0, 0, 0}
        // 6 -> counterArr = {0, 0, 0, 0, 0, 0, 1}
        // 4 -> counterArr = {0, 0, 0, 0, 1, 0, 1}
        // 3 -> counterArr = {0, 0, 0, 1, 1, 0, 1}
        // 2 -> counterArr = {0, 0, 1, 1, 1, 0, 1}
        // 1 -> counterArr = {0, 1, 1, 1, 1, 0, 1}
        // 4 -> counterArr = {0, 1, 1, 1, 2, 0, 1}

        for (int number: arr) {
            counterArr[number]++;
            //counterArr[number/100]++;
        }
        System.out.println("Counter arr after: " + Arrays.toString(counterArr));

        int inputArrIndex = 0;
        for (int i = 0; i < counterArr.length; i++) {
            for (int j = counterArr[i]; j > 0; j--) {
                arr[inputArrIndex] = i;
                //arr[inputArrIndex] = i*100;
                inputArrIndex++;
            }
        }
    }

    public static void countingSortOptimized(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(String.format("Min: %d; Max: %d", min, max));


        int[] counterArr = new int[max - min + 1]; // 6 - (-6) + 1 = 13
        System.out.println("Counter arr before: " + Arrays.toString(counterArr));
        // min = -6, max = 6
        for (int number: arr) {
            counterArr[number - min]++;
        }
        System.out.println("Counter arr after: " + Arrays.toString(counterArr));

        int inputArrIndex = 0;
        for (int i = 0; i < counterArr.length; i++) {
            for (int j = counterArr[i]; j > 0; j--) {
                System.out.println("i: " + i + " inputArrIndex: " + inputArrIndex + " i+min: " + (i + min));
                arr[inputArrIndex] = i + min;
                inputArrIndex++;
            }
            System.out.println("Next iteration...");
        }
    }
}
