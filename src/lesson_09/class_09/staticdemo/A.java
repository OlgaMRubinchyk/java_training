package lesson_09.class_09.staticdemo;

public class A {
    public static int x = 0; // static
    public int y = 4; // non-static

    A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        System.out.println(x);
        // System.out.println(y);

        A a1 = new A(2, 3);
        A a2 = new A(7, 9);

        System.out.println(a1.x); // 2 - no!! 7

        sum(6, 4);
    }

    public static void sum(int a, int b) {
    // public void sum(int a, int b) { // should be static
        System.out.println((a + b));
    }
}
