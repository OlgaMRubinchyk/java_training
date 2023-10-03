package lesson_10.class_10.abstraction.remotecontrol;

public interface IDVDRemoteControl extends IGenericRemoteControl {
    void play();
    void eject();
    void insertDisk();
    void stop();

    public static void main(String[] args) {
        System.out.println("Hello from interface!");
    }

    default void testDefaultMethod() {
        System.out.println("Test default method");
    }

}
