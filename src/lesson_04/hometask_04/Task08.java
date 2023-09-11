package lesson_04.hometask_04;
/*Write a program in which the user enters an array, then turns the elements of
        the array (this should be a change to affect the array itself) in reverse order and
        outputs them. Solve the problem with:
        - one additional array
        - no additional arrays
        Example:
        Input:
        [1, 2, 3, 4, 5]
        Output:
        [5, 4, 3, 2, 1]*/
public class Task08 {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 4, 5, 2, 5, 17, 64, 55, 17, 27, 5, 12};
        System.out.println("Initial array is:");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }
        System.out.println();
        int[] array2 = new int[array1.length];
        System.out.println("Reversed array using additional array:");
        // Calculating elements of array using additional array
        for (int index = 0; index < array1.length; index++) {
            array2[index] = array1[array1.length - index - 1];
            System.out.print(array2[index] + " ");
        }
        System.out.println();
        // Calculating elements of array NOT using additional array
        // but using additional variable temp
        int temp;
        for (int index = 0; index < array1.length / 2; index++) {
            temp = array1[index];
            array1[index] = array1[array1.length - index - 1];
            array1[array1.length - index - 1] = temp;
        }
        System.out.println("Reversed array NOT using additional array:");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }
    }
}
