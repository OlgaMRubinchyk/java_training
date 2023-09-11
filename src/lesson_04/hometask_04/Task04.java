package lesson_04.hometask_04;
/*
Write a program that reads an array and print whether it is mirrored. The
        following arrays are mirrored:
        [4 6 6 4]
        [3]
        [23 4 4 23]
        [7 1 12 6 3 6 12 1 7]
*/

public class Task04 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 6, 5, 6, 4};
        System.out.println("Array is:");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Check if array is mirrored
        boolean isMirrored = false;
        for (int i = 0; i < arr1.length / 2 - 1; i++) {
            if (arr1[i] == arr1[arr1.length - i - 1]) {
                isMirrored = true;
            } else {
                isMirrored = false;
                break;
            }
        }
        System.out.println("Array is mirrored: " + isMirrored);
    }
}
