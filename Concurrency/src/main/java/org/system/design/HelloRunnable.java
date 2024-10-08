package org.system.design;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world from Runnable!");
    }
}
