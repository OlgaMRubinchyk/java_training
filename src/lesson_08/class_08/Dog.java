package lesson_08.class_08;

public class Dog {
    // Properties or Fields of the class
    String breed;
    String size;
    int age;
    String color;

    Dog() {

    }
    Dog(String breed, int age) {
        this();
        this.breed = breed;
        this.age = age;
    }
    Dog(String breed, int age, String color) {
        this(breed, age); // calling Constructor
        this.color = color;
    }

    public void eat() {
        System.out.println("I am eating my dog food!");
    }

    public void changeColor(String newColor) {
        color = newColor;
    }
}
