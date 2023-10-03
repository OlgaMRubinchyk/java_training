package lesson_10.class_10.abstraction.remotecontrol;

public class LGTVRemoteControl implements ITVRemoteControl {
    @Override
    public void turnOn() {
        System.out.println("[LG] TV is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("[LG] TV is turning off...");
    }

    @Override
    public void channelUp() {
        System.out.println("[LG] TV is Channelling up...");
    }

    @Override
    public void channelDown() {
        System.out.println("[LG] TV is Channelling down...");
    }

    @Override
    public void goToChannel(int index) {
        System.out.println("[LG] Going to channel " + index);
    }

    @Override
    public void stop() {

    }
}
