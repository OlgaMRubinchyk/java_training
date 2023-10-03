package lesson_10.class_10.abstraction.remotecontrol;

public class SonyDVDRemoteControl implements IDVDRemoteControl {
    @Override
    public void turnOn() {
        System.out.println("[Sony] DVD is turning on...");
    }
    @Override
    public void turnOff() {
        System.out.println("[Sony] DVD is turning off...");
    }
    @Override
    public void play() {
        System.out.println("[Sony] DVD will play the disk...");
    }
    @Override
    public void eject() {
        System.out.println("[Sony] DVD will eject the disk...");
    }
    @Override
    public void insertDisk() {
        System.out.println("[Sony] Inserting the disk in DVD...");
    }
    @Override
    public void stop() {
        System.out.println("[Sony] Stopping the DVD...");
    }
    @Override
    public void testDefaultMethod() {
        System.out.println("Test default method in the class");
    }
}
