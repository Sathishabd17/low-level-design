package org.system.design;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world! " + new Date().getTime());
        (new Thread(new HelloRunnable())).start();

        Thread.sleep(5000);
        System.out.println("Sleep time finished " + new Date().getTime());
        (new HelloThread()).start();
    }
}