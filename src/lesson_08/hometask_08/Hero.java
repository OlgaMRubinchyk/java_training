package lesson_08.hometask_08;

import lesson_08.class_08.Person;

public class Hero {
    String name;
    int health;
    int strength;
    int experience;
    int level;

    // default constructor
    Hero() {
        name = "Default Hero";
        health = 100;
        strength = 7;
        experience = 0;
        level = 1;
    }

    //constructor with all fields
    Hero(String name, int health, int strength, int experience, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.experience = experience;
        this.level = level;
    }

    public void attack(Enemy enemy) {

    }
    public void avoid() {

    }
    public void levelUp() {

    }
}
