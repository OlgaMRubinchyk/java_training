package lesson_02.class_02;
public class Operators {

    public static void main(String[] args) {
        // addition / subtraction
        int a = 10;
        int b = 5;

        System.out.println(a + b);
        int result = a - b;
        System.out.println(result);

        // division / multiplication
        int c = 10;
        int d = 5;
        System.out.println(c / d);
        System.out.println(c * d);

        // modulus - remaining of the division
        System.out.println(7 % 5);
        System.out.println(10 % 5);
        System.out.println(11 % 3);

        // ++ increment -> number + 1
        // -- decrement -> number - 1
        System.out.println(c++); // 10: returning 10 and then increments c (10+1=11)
        System.out.println(++c); // 12: increments c (11+1=12) and then returning 12

        int predecrement = 10;
        System.out.println(--predecrement);

        int postdecrement = 10;
        System.out.println(postdecrement--);

        int x = 5;
        int y = 3;
        int z = 4;

        System.out.println(++x + x++); // 12
        // x = 7 now :)
        // x++ + ++y - --z + (z-- + x + y++) + x++ + ++y + z--
        // Mind Game here
        System.out.println("Mind Game: " + (x++ + ++y - --z + (z-- + x + y++) + x++ + ++y + z--));
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        z+=10; // z = z+10
        System.out.println(z);

        y-=5;
        System.out.println(y);

        int e = 5; // setting value
        int r = 5;
        System.out.println(e == r); // checking if variables are equal - true
        System.out.println(e != r); // checking if variables are not equal - false
        System.out.println(7 != 8); // checking if variables are not equal - true

        // Comparison operators
        int t = 7;
        int o = 9;
        System.out.println(t > o); // false
        System.out.println(t >= o); // false
        System.out.println(t < o); // true
        System.out.println(t <= o); // true
        System.out.println(9 <= 9); // true

    }
}