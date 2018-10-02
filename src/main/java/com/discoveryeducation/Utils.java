package com.discoveryeducation;

public class Utils extends DriverManager {

    public void waitForSomeTime()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
