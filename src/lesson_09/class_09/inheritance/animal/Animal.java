package lesson_09.class_09.inheritance.animal;

public class Animal {
    private int age;
    public double weight;

    public void breathe() {
        System.out.println("I'm breathing");
    }

    public void walk() {
        System.out.println("I'm walking");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animal{" + "age = " + age + ", weight = " + weight + '}';
    }
}
