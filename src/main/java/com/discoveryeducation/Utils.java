package com.discoveryeducation;

public class Utils extends DriverManager {

    static String newRandom;

    public void waitForSomeTime()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForLongTime()
    {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
