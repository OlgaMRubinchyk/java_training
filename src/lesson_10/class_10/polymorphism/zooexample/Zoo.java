package lesson_10.class_10.polymorphism.zooexample;

public class Zoo {
    private Animal[] animals;

    public Zoo(int numberOfAnimals) {
        animals = new Animal[numberOfAnimals];
    }

    public void addAnimal(Animal animal, int place) {
        animals[place] = animal;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
