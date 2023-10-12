package lesson_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList<>();
        int numberOfIntegers = 20;
        int maxInt = 5000;

        // create List
        Random random = new Random();
        for (int i = 0; i < numberOfIntegers; i++) {
            intArrayList.add(random.nextInt(maxInt));
        }

        // user inputs number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user's number: ");
        int userNumber = scanner.nextInt();
        int userNumberIndex = intArrayList.indexOf(userNumber);
        if (userNumberIndex == -1) {
            System.out.println("Your number " + userNumber + " is absent in the List.");
        } else {
            System.out.println("Your number " + userNumber + " has index " + userNumberIndex + " in the List.");
        }

        // show all elements in the List
        System.out.println("All elements in the List: " + intArrayList);

        // show min and max
        int minNumber = intArrayList.get(0);
        int maxNumber = intArrayList.get(0);
        for (int i = 1; i < numberOfIntegers; i++) {
            if (intArrayList.get(i) > maxNumber) {
                maxNumber = intArrayList.get(i);
            }
            if (intArrayList.get(i) < minNumber) {
                minNumber = intArrayList.get(i);
            }
        }
        System.out.println("Minimum is: " + minNumber);
        System.out.println("Maximum is: " + maxNumber);

   }
}
