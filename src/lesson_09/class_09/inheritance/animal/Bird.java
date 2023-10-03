package lesson_09.class_09.inheritance.animal;

public class Bird extends Animal{
    private int flyingSpeed;
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void walk() {
        System.out.println("Jump jump jump");
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }
}
