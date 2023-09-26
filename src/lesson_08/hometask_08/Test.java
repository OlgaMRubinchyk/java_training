package lesson_08.hometask_08;

import static java.lang.Math.sqrt;

public class Test {
    private int x;
    private int y;
    Test() {
        x = 5;
        y = 10;
        System.out.println("Default constructor: " + this);
    }
    Test(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor with parameters: " + this);
    }

    public double findLength() {
        return sqrt(x * x + y * y);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public Test add(int x_, int y_) {
        return new Test(x + x_, y + y_);
    }
}
