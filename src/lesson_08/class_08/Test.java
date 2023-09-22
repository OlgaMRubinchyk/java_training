package lesson_08.class_08;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // constructor. First object is created
        dog1.breed = "Dalmatian";
        dog1.size = "Large";
        dog1.age = 3;

        Dog dog2 = new Dog("Shpaniol", 2);
        // Dog dog4 = new Dog(2, "Shpaniol");

        System.out.println(dog1.age + " " + dog2.age);
        System.out.println(dog1.breed + " " + dog2.breed);
        System.out.println(dog1);

        Dog dog3 = null;
        //System.out.println(dog3.age); // NullPointerException

        // Calling eat method
        dog1.eat();
        dog2.eat();

        System.out.println(dog1.color);
        dog1.changeColor("pink");
        System.out.println(dog1.color);

        int a = 5;
        int b = 5;
        int sum = 0;

        sum(a, b, sum);
        System.out.println("Outside: " + sum); // sum is 0

        int[] sumArr = new int[1];

        sum(a, b, sumArr);
        //sum = sum(a, b, sumArr);
        System.out.println("Outside: " + sumArr[0]);

        Dog dog5 = new Dog("Shpaniol", 2, "white");
        System.out.println(dog5.color);

    }

     public static void sum(int a, int b, int sum) {
        sum = a + b;
        System.out.println("Inside: " + sum);
        // return sum;
     }

    public static void sum(int a, int b, int[] sum) {
        sum[0] = a + b;
        System.out.println("Inside: " + sum[0]); // 10
    }
}
