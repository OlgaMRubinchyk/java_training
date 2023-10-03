package lesson_10.class_10.abstraction.abstractclass;

public interface Breathable {
    String NAME = "Name";
    void breathe();

    default void doSomething() {
        System.out.println("Doing something...");
    }

    static void doAnything() {
        System.out.println("Static method!");
    }
}
