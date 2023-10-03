package lesson_09.class_09.staticdemo;

public class A {
    public static int x = 0;
    public int y = 4;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        A a1 = new A(2, 3);
        A a2 = new A(7, 9);

        System.out.println(a1.x); // 7
        System.out.println(a2.y); // 9

        a2.y++; // 10
        a1.x += a2.y; // 7 + 10 = 17

        System.out.println(a1.x); // 17
        a2.y = a1.y - 1; // 3 - 1 = 2
        System.out.println(a2.y); // 2

    }
}
