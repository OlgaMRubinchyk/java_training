package lesson_10.class_10.polymorphism.zooexample;

public class Dog extends Animal{
    @Override
    public void walk() {
        System.out.println("Walking like a dog");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Bark");
    }
}
