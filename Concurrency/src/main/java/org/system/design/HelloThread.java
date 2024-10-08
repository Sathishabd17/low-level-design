package org.system.design;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello world from Thread!");
    }
}
