package org.system.design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Singleton foo = Singleton.getInstance("FOO");
        System.out.println(foo);

        Singleton bar = Singleton.getInstance("BAR");
        System.out.println(bar);
    }
}