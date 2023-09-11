package lesson_03.class_03;

public class WhileLoop {
    public static void main(String[] args) {
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Running");
            double random = Math.random() * 10; // 0.0 - 9.9

            if (random > 7) {
                shouldContinue = false;
            }
            System.out.println(random);
        }
        System.out.println("Out!");

        int count = 0;
        while (count < 11) {
            System.out.println(count);
            count++;
        }

        int number = 0;
        while (number <= 5) {
            System.out.println(number);
            number++;
        }

    }
}
