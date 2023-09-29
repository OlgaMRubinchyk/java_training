package lesson_09.class_09.staticdemo;

public class Penguin {
    static String color;
    private String name;
    private int age;
    static int weight;

    static {
        color = "Black and white";
        weight = 2;
    }

    Penguin(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name is: " + getName() + " age is: " + getAge());
    }

    static void makeASound() {
        System.out.println("Making a sound!!");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
