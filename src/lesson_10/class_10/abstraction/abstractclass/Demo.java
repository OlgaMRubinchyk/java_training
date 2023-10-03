package lesson_10.class_10.abstraction.abstractclass;

public class Demo {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // not possible, class Animal is abstract

        Animal animal = new Cat(); // abstraction
        System.out.println(animal.getAge());
        animal.growWithYear();
        System.out.println(animal.getAge());

        Animal.eat("burger");

    }
}
