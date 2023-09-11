package lesson_04.class_04;

/*
Find the smallest number in each row of Array
*/
public class Task01 {
    public static void main(String[] args) {
        int array2D[][] = {
                {1, 6, -8, 25, 65},
                {12, 69, -18, -25, -5},
                {13, 656, -82, 259, -65}
        };

        for (int i = 0; i < array2D.length; i++) {
            int smallest = array2D[i][0];
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] < smallest) {
                    smallest = array2D[i][j];
                }
            }
            System.out.println("Smallest in row " + i + " is " + smallest);
        }

    }
}
