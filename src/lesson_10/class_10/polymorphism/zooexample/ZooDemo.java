package lesson_10.class_10.polymorphism.zooexample;

public class ZooDemo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);
        Animal cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();

        zoo.addAnimal(cat, 0);
        zoo.addAnimal(dog, 1);
        zoo.addAnimal(bird, 2);

        Animal[] animalsInTheZoo = zoo.getAnimals();
        for (int i = 0; i < animalsInTheZoo.length; i++) {
            // System.out.println(animalsInTheZoo[i]);
            if (animalsInTheZoo[i] != null) {
                animalsInTheZoo[i].walk();
                animalsInTheZoo[i].makeSomeNoise();
            }
        }

        /*Animal bird2 = new Bird();
        bird2.sing();*/

        Animal bird2 = new Bird();
        ((Bird) bird2).sing();

        /*Animal bird22 = new Cat();
        ((Bird) bird22).sing();*/

        //((Cat) bird2).walk(); // ClassCastException

        System.out.println("-------------------------");
        for (int i = 0; i < animalsInTheZoo.length; i++) {
            // System.out.println(animalsInTheZoo[i]);
            if (animalsInTheZoo[i] != null) {
                animalsInTheZoo[i].walk();
                animalsInTheZoo[i].makeSomeNoise();

                if (animalsInTheZoo[i] instanceof Bird) {
                    System.out.println("I am a bird!");
                    ((Bird) animalsInTheZoo[i]).sing();
                }

            }
        }
    }
}
