package lesson_03.class_03;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        do {
            System.out.println("Enter a number");
            int number = sc.nextInt();

            sum = sum + number; // sum += num;
            counter++;
        } while (counter < 3);

        System.out.println(sum);
    }
}
