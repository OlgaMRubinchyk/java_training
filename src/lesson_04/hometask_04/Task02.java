package lesson_04.hometask_04;
/*Write a program that reads an array and creates a new array from it. Half
        of the elements of the new array must exactly be like the second half of the
        original, and the other half are the same elements, but in reverse order. Bring
        the new array to the screen.
        Example:
        Input:
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Output:
        [6, 7, 8, 9, 10, 10, 9, 8, 7, 6]*/
public class Task02 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 2, 4, 5, 6, 7, 9, 9, 10};
        System.out.println("Array is:");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        // Substitute left half by right half
        for (int i = 0; i < arr1.length / 2; i++) {
            arr1[i] = arr1[i + arr1.length / 2];
        }
        System.out.println();

        // Substitute right side by mirrored left side
        for (int i = arr1.length / 2; i < arr1.length; i++) {
            arr1[i] = arr1[arr1.length - i - 1];
        }
        System.out.println("Result:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
