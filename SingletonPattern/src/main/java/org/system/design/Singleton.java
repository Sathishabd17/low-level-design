package org.system.design;

public class Singleton {

    private static Singleton instance;
    private final String value;

    private Singleton(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "value='" + value + '\'' +
                '}';
    }

    public static Singleton getInstance(String value) {
        if (instance == null)
            instance = new Singleton(value);
        return instance;
    }
}
