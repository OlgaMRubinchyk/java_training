package lesson_03.class_03;

public class NestedLoops {
    public static void main(String[] args) {
        int a = 1;
        //int b = 1;
        // What is wrong?
        while (a < 10) {
            // b should be here!
            int b = 1;
            while (b < 10) {
                System.out.println(a + " " + b);
                b++;
            }
            a++;
        }
        // 11 - why?
        System.out.println("-----------------------");

        for (int aa = 1; aa < 10; aa++) {
            for (int bb = 1; bb < 10; bb++) {
                System.out.println(aa + " " + bb);
                // break stops inner loop only
                if (bb == 3) {
                    break;
                }
            }
        }
        System.out.println("-----------------------");

        for (int aa = 0, bb = 10; aa <= bb; aa++, bb--) {
            if (aa == 2 || aa == 4) {
                continue;
            }
            System.out.println(aa + " " + bb);
            if (aa == 3) {
                break;
            }

        }

    }
}
