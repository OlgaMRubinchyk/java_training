package lesson_10.class_10.abstraction.remotecontrol;

public class SamsungTVRemoteControl implements ITVRemoteControl {
    @Override
    public void turnOn() {
        System.out.println("[Samsung] TV is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("[Samsung] TV is turning off...");
    }

    @Override
    public void channelUp() {
        System.out.println("[Samsung] Channelling up...");
    }

    @Override
    public void channelDown() {
        System.out.println("[Samsung] Channelling down...");
    }

    @Override
    public void goToChannel(int index) {
        System.out.println("[Samsung] Going to channel " + index);
    }

    @Override
    public void stop() {

    }
}
