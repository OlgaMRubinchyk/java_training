package lesson_03.class_03;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 - 100
        for (int index = 1; index <= 100; index += 10) {
            System.out.println(index);
        }

        for (int index = 100; index >= 1; index--) {
            System.out.println(index);
        }
    }
}
