package lesson_10.class_10.abstraction.remotecontrol;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {


        // IGenericRemoteControl
        ITVRemoteControl tvRemoteControl;

        int random = new Random().nextInt(11);
        if (random < 3) {
            tvRemoteControl = new SamsungTVRemoteControl();
        } else if (random >= 3 && random < 7) {
            tvRemoteControl = new PhilipsUniversalRemoteControl();
        } else {
            tvRemoteControl = new LGTVRemoteControl();
        }

        tvRemoteControl.turnOn();
        tvRemoteControl.goToChannel(4);
        tvRemoteControl.turnOff();


    }
}
