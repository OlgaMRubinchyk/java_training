package lesson_08.hometask_08;

import java.util.Random;

public class HeroesDemo {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hero1", 100, getRandomNumber(10, 5), 0, 1);

        //getProbability();
        for (int i = 0; i < 2; i++) {
            Enemy enemy1 = new Enemy(getRandomNumber(200, 100) * hero1.level,
                    getRandomNumber(8, 3) + (int)(0.1 * hero1.strength), getRandomNumber(hero1.level,1));

            if (enemy1.strength > hero1.strength) {
                hero1.avoid();
                continue;
            }
             boolean tossC = tossCoin();
            // choose who hits first
            if (tossC) {
                // hero starts
                hero1.attack(enemy1);
                System.out.println("Enemy health after first hit: " + enemy1.health);

            } else {
                // enemy starts
                enemy1.attack(hero1);
                System.out.println("Hero health after first hit: " + hero1.health);
            }

            while (hero1.health > 0 && enemy1.health > 0) {
                if (!tossC) {
                    // enemy starts
                    hero1.attack(enemy1);
                    System.out.println("Enemy health after hit: " + enemy1.health);

                } else {
                    // hero starts
                    enemy1.attack(hero1);
                    System.out.println("Hero health after hit: " + hero1.health);
                }
                tossC = !tossC;
            }

        }

    }

    public static boolean tossCoin() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
    public static int getRandomNumber(int max, int min) {
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }


}
