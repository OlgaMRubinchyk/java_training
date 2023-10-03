package lesson_10.class_10.abstraction.remotecontrol;

public interface ITVRemoteControl extends IGenericRemoteControl {
    void channelUp();
    void channelDown();
    void goToChannel(int index);
    void stop();

}
