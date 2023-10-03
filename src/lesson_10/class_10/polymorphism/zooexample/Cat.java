package lesson_10.class_10.polymorphism.zooexample;

public class Cat extends Animal{
    @Override
    public void walk() {
        System.out.println("Walking like a cat");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Meow");
    }
}
