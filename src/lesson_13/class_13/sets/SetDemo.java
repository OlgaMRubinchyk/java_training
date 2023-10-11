package lesson_13.class_13.sets;

import lesson_09.class_09.staticdemo.A;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("Jinks");

        Animal dog = new Animal();
        dog.setName("Axel");

        Animal cat2 = new Animal();
        cat.setName("Jinks");

        Set<Animal> animals = new HashSet<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);

        System.out.println(animals);

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(6);
        numbers.add(11);
        numbers.add(2);
        numbers.add(7);
        numbers.add(0);
        numbers.add(11); // not added because it exists already

        numbers.remove(2);

        System.out.println(numbers.toString());
        System.out.println(numbers.size());
    }
}
