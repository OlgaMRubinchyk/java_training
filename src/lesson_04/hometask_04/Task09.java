package lesson_04.hometask_04;
/*Write a program that reads array with 10 numbers and exchanged places of
        elements with indexes:
        - 0 and 1, 8 and 9 via third variable
        - 2 and 3 by addition / subtraction
        - 4 and 5 by multiplication
        - 6 and 7 by bitwise operations (optional) or by third variable
        Example:
        Input:
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Output:
        [2, 1, 4, 3, 6, 5, 8, 7, 10, 9]*/
public class Task09 {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial array is:");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }
        System.out.println();

        int temp;
        System.out.println("Swiping 0 and 1, 8 and 9, 2 and 3, 4 and 5 elements:");
        for (int index = 0; index < array1.length; index++) {
            // Swipe 0 and 1, 8 and 9, 6 and 7 elements using 3rd variable
            if ((index == 0) || (index == array1.length - 2) || (index == array1.length / 2 + 1)) {
                temp = array1[index];
                array1[index] = array1[index + 1];
                array1[index + 1] = temp;
            }
            if (index == 2) {
                array1[index] = array1[index] + array1[index + 1];
                array1[index + 1] = array1[index] - array1[index + 1];
                array1[index] = array1[index] - array1[index + 1];
            }
            if ((index == 4) && (array1[index] * array1[index + 1] != 0)) {
                array1[index] = array1[index] * array1[index + 1];
                array1[index + 1] = array1[index] / array1[index + 1];
                array1[index] = array1[index] / array1[index + 1];
            }
            System.out.print(array1[index] + " ");
        }
    }
}
