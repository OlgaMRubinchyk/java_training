package lesson_04.hometask_04;

/*
Write a program that reads 2 arrays, then compares them and displays a
        message whether they are the same or not.
        Example:
        Input:
        Example 1: [1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]
        Example 2: [1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 4, 6]
        Output:
        Example 1: Identical
        Example 2: Not identical
*/
public class Task06 {
    public static void main(String[] args) {
        int[] array1 = {5, 7, 12, -12, 0, 45};
        int[] array2 = {5, 7, 12, -12, 0, 45};
        boolean areIdentical = false;

        // Print both arrays:
        System.out.println("Array1: ");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }
        System.out.println();
        System.out.println("Array2: ");
        for (int index = 0; index < array2.length; index++) {
            System.out.print(array2[index] + " ");
        }
        System.out.println();

        // Comparing elements of array:
        if (array1.length == array2.length) {
            for (int index = 0; index < array1.length; index++) {
                if (array1[index] == array2[index]) {
                    areIdentical = true;
                } else {
                    areIdentical = false;
                    break;
                }
            }
            System.out.println("Arrays are identical: " + areIdentical);
        } else {
            System.out.println("Arrays have different length, so they are identical: " + areIdentical);
        }
    }
}
