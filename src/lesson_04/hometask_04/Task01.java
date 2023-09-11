package lesson_04.hometask_04;
/*Write a program that read the array and find the largest number multiple of 5 in
        the array.
        Example:
        Input:
        [1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12]
        Output:
        55*/
public class Task01 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 4, 5, 2, 5, 17, 64, 55, 17, 27, 5, 12};
        int max = arr1[0];
        int max5 = arr1[0];
        System.out.println("Array is:");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
            // Finding max value
            if (arr1[i] > max) {
                max = arr1[i];
            }
            // Finding max value divisible by 5
            if ((arr1[i] % 5 == 0) && (arr1[i] > max5)) {
                max5 = arr1[i];
            }
        }
        System.out.println();
        System.out.println("Max value in array is " + max);

        if (max5 % 5 != 0) {
            System.out.println("There are no values divisible by 5.");
            return;
        }
        System.out.println("Max value in array divisible by 5 is " + max5);

    }
}
