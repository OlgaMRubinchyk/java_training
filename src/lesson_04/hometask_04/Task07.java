package lesson_04.hometask_04;
/*Write a program that finds and outputs the longest sequence of identical
        sequential elements in an array.
        Example:
        Input:
        [1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10]
        Output:
        7, 7, 7, 7, 7, 7*/
public class Task07 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10};

        // Print array:
        System.out.println("Array1: ");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }
        System.out.println();

        int counter = 1;
        int temp = 1;
        int tempArrayElement = array1[0];
        for (int index = 1; index < array1.length; index++) {
            if (array1[index] == array1[index - 1]) {
                counter++;

            } else {
                if (counter > temp) {
                    temp = counter;
                    tempArrayElement = array1[index - 1];
                }
                counter = 1;
            }
        }

        if (counter > temp) {
            System.out.println("Counter = " + counter);
            for (int index = 0; index < counter; index++) {
                System.out.print(tempArrayElement + " ");
            }
        } else {
            System.out.println("Counter = " + temp);
            for (int index = 0; index < temp; index++) {
                System.out.print(tempArrayElement + " ");
            }
        }



    }
}
