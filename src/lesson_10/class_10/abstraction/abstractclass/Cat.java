package lesson_10.class_10.abstraction.abstractclass;

public class Cat extends Animal {
    @Override
    public String makeNoise(String name, boolean isMale) {
        System.out.println("Making noise like Cat! I am " + name + " isMale: " + isMale);
        return "";
    }

    @Override
    public void breathe() {
        System.out.println("Breathing like a cat!");
    }

    /*@Override
    public void doSomething() {
        super.doSomething();
    }*/
}
