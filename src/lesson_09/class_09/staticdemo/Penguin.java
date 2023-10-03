package lesson_09.class_09.staticdemo;

public class Penguin {
    static String color;// = "Black and white";
    private String name;
    private int age;
    static int weigth;

    static {
        color = "Black and white";
        weigth = 2;
    }

    public Penguin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    static void makeASound() {
        System.out.println("Penguin sound...");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
