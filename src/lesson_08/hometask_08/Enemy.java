package lesson_08.hometask_08;

public class Enemy {
    int health;
    int strength;
    int level;
    Enemy() {
        health = 150;
        strength = 4;
        level = 1;
    }

    Enemy(int health, int strength, int level) {
        this.health = health;
        this.strength = strength;
        this.level = level;
    }
    public void attack(Hero hero) {

    }
}
