package lesson_10.class_10.abstraction.remotecontrol;

public class PhilipsUniversalRemoteControl implements ITVRemoteControl, IDVDRemoteControl {
    @Override
    public void play() {
        System.out.println("[Philips] DVD will play the disk...");
    }

    @Override
    public void eject() {
        System.out.println("[Philips] DVD will eject the disk...");
    }

    @Override
    public void insertDisk() {
        System.out.println("[Philips] DVD will insert the disk...");
    }

    @Override
    public void stop() {
        System.out.println("[Philips] DVD will stop the disk...");
    }

    @Override
    public void turnOn() {
        System.out.println("[Philips] DVD/TV is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("[Philips] DVD/TV is turning off...");
    }

    @Override
    public void channelUp() {
        System.out.println("[Philips] TV is channelling up...");
    }

    @Override
    public void channelDown() {
        System.out.println("[Philips] TV is channelling down...");
    }

    @Override
    public void goToChannel(int index) {
        System.out.println("[Philips] TV will go to channel " + index);
    }
}
