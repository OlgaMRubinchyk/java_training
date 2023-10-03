package lesson_09.class_09.inheritance.animal;

public class Dog {
    private boolean isDangerous;
    public void bringStick() {
        System.out.println("I've brought you a stick!");
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
