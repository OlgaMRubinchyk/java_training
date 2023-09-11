package lesson_04.class_04;

public class DeclaringArrays {
    public static void main(String[] args) {
        // Declaration of Arrays
        int[] array = null;
        int array2[];
        System.out.println(array);

        // Initialization of Arrays
        //array = new int[10]; // 10 - size of array
        System.out.println(array); // prints [I@15aeb7ab

        // Declaration and Initialization of Arrays
        int[] array3 = new int[10];
        // OR:
        int[] array4 = {5, 7, 12, -12, 0, 45};

        //System.out.println("Array2 length: " + array2.length);
        System.out.println("Array3 length: " + array3.length); //10
        System.out.println("Array4 length: " + array4.length); //6
        //System.out.println("Array1 length: " + array.length); // null!! if array is not initialized

        System.out.println(array4[5]);
        array3[0] = 10;
        array3[1] = -5;
        //array3[15] = 43; // ArrayIndexOutOfBoundsException
        //System.out.println(array4[8]); // ArrayIndexOutOfBoundsException

    }
}
