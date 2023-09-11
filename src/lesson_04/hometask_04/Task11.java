package lesson_04.hometask_04;
/*
We have two one-dimensional arrays with natural numbers. Create a program
        that compares all numbers
        with the same indexes from both arrays and writes in a third array the smaller of
        the two numbers. At the end print the console the following:
        - the content of all three arrays
        - the sum of the three arrays
        - the product of the elements of the last array
        Example:
        Input:
        [18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
        [ 1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
        Output:
        The content of all 3 arrays
        [18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
        [1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
        [1, 2, 3, 1, 3, 4, 5, 6, 7, 8]
        The sum of the 3 arrays: 103 + 104 + 40 = 247
        The product of the elements of the third array: 120 960
*/
public class Task11 {
    public static void main(String[] args) {
        int[] array1 = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
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
        System.out.println("Result Array3:");

        // Comparing elements with the same indexes
        int[] array3 = new int[array1.length];
        if (array1.length == array2.length) {
            for (int index = 0; index < array1.length; index++) {
                if (array1[index] <= array2[index]) {
                    array3[index] = array1[index];
                } else {
                    array3[index] = array2[index];
                    }
                System.out.print(array3[index] + " ");
            }
        } else {
            System.err.println("Arrays have different length");
            return;
        }

        // Calculating the sum of all three arrays and the product of 3rd array
        System.out.println();
        int sum = 0;
        int product = 1;
        for (int index = 0; index < array1.length; index++) {
            sum = sum + array1[index] + array2[index] + array3[index];
            product = product * array3[index];
        }
        System.out.println("The sum of all three arrays is " + sum);
        System.out.println("The product of 3rd array is " + product);
    }
}
