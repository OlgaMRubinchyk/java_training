package lesson_04.class_04;

public class AccessingArrays {
    public static void main(String[] args) {
        int[] array = {5, 7, -2, 12, 0};

        // Using for loop
        System.out.println("Using for loop:");
        for (int index = 0; index < array.length; index++) {
            System.out.println("Element " + index + ": " + array[index]);
        }

        // Backwards
        System.out.println("*************");
        System.out.println("Backwards:");
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.println("Element " + index + ": " + array[index]);
        }

        // Using While loop
        System.out.println("Using while loop:");
        int i = 0;
        while (i < array.length) {
            System.out.println("Element " + i + ": " + array[i]);
            i++;
        }

        // Using Do While loop
        System.out.println("Using while loop:");
        int j = 0;
        do {
            System.out.println("Element " + j + ": " + array[j]);
            j++;
        } while (j < array.length);

        // Using foreach loop
        System.out.println("Using foreach loop:");
        for (int number : array) {
            System.out.println(number);
        }
    }
}
