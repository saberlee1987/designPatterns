package com.saber.command.sample1.fan;

public class Fan {
    private int speed;
    private boolean state;

    public void startFan() {
        if (!state) {
            speed = 1;
            state = true;
            System.out.println("fan stated ....");
        } else {
            System.out.println("fan before stated ....");
        }
    }

    public void stopFan() {
        if (state) {
            speed = 0;
            state = false;
            System.out.println("fan stopped ....");
        } else {
            System.out.println("fan is not start ....");
        }
    }

    public void increaseSpeedFan() {
        if (state && speed < 5) {
            speed++;
            System.out.println("fan increase speed to " + speed);
        } else {
            if (!state) {
                System.out.println("fan must be start before increase speed");
            } else {
                System.out.println("fan is  maximum speed ");
            }
        }
    }
    public void deCreaseSpeedFan() {
        if (state && speed > 0) {
            speed--;
            System.out.println("fan decrease speed to " + speed);
        } else {
            if (!state) {
                System.out.println("fan must be start before increase speed");
            } else {
                System.out.println("fan is  minimum speed ");
            }
        }
    }
}
