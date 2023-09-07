package lesson_03.hometask_03;
/*
Write a program that aims to output all natural three-digit numbers that do not
        have the same digits.
*/
public class Task12 {
    public static void main(String[] args) {
        System.out.println("List of all natural 3-digit numbers that do not have the same digits:");

        for (int index = 100; index <= 999; index++) {
            // Calculating each digit
            int firstDigit = index / 100;
            int secondDigit = index / 10 % 10;
            int thirdDigit = index % 10;

            if (!((firstDigit == secondDigit) || (secondDigit == thirdDigit) || (firstDigit == thirdDigit))) {
                System.out.println(index);
            }
        }

    }
}
