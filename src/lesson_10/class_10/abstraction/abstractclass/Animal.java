package lesson_10.class_10.abstraction.abstractclass;

public abstract class Animal implements Breathable {
    private int age;
    private int weight;

    public Animal() {
        System.out.println("Animal - default constructor");
    }

    public Animal(int age, int weight) {
        this();
        this.age = age;
        this.weight = weight;
    }

    public abstract Object makeNoise(String name, boolean isMale);

    protected final void growWithYear() {
        age++;
    }

    public static int eat(String food) {
        System.out.println("Eating food: " + food);
        return 10;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
