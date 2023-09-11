package lesson_04.class_04;

import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = new int[] {1, 9, 3, 4};
        int[] a2 = new int[] {1, 9, 3, 4};


        int a = 5;
        if (a1 == a2) { // NOT equal!! because pointing to different addresses in memory (references)
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are NOT equal");
        }
        System.out.println(a1); // printing references, not arrays
        System.out.println(a2); // printing references, not arrays

        if (a1.equals(a2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are NOT equal");
        }

        // *******************
        // using out code
        boolean areSame = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    areSame = false;
                    break;
                }
            }
        } else {
            areSame = false;
        }
        System.out.println("Arrays are same: " + areSame);


        // using Arrays.equal
        if (Arrays.equals(a1, a2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are NOT equal");
        }

        // Corner case Arrays.deepEquals(arr1, arr2)


        // ***************
        a1 = new int[] {1, 9, 3, 4};
        a2 = new int[] {1, 92, -3, 14, 75, 81};
        System.out.println("a1 -> " + Arrays.toString(a1));
        System.out.println("a2 -> " + Arrays.toString(a2));

        a1 = a2;
        a2[2] = 100;
        System.out.println("a1 -> " + Arrays.toString(a1));
        System.out.println("a2 -> " + Arrays.toString(a2));

        /*a2[2] = 500;
        System.out.println("a1 -> " + Arrays.toString(a1));
        System.out.println("a2 -> " + Arrays.toString(a2));
        */
    }
}
