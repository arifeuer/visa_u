package com.visa.casino;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public enum MachineWheelState {
        GOLD, CHERRY, CLOVER, COIN, SEVEN, HEART, BANANA
    }


    public static void main(String[] args) {
        //Generate three random ints between [0, length of MachineWheelState)
        //ThreadLocalRandom rand = new ThreadLocalRandom();
        int enum_len = MachineWheelState.values().length;
        int spin_1 = ThreadLocalRandom.current().nextInt(0, enum_len);
        int spin_2 = ThreadLocalRandom.current().nextInt(0, enum_len);
        int spin_3 = ThreadLocalRandom.current().nextInt(0, enum_len);

        //Convert to wheel state
        MachineWheelState wheel_1 = MachineWheelState.values()[spin_1];
        MachineWheelState wheel_2 = MachineWheelState.values()[spin_2];
        MachineWheelState wheel_3 = MachineWheelState.values()[spin_3];

        MachineWheelState[] wheelStates = {wheel_1, wheel_2, wheel_3};

        for (int i = 0; i < 3; i++) {
            System.out.print(wheelStates[i] + ":");
        }

    }
}
