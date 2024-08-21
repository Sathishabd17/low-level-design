package org.system.design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Context context = new Context();
        String strategy = "***";

        if (strategy.equalsIgnoreCase("+++")) {
            context.setStrategy(new AdditionStrategy());
        } else if (strategy.equalsIgnoreCase("---")) {
            context.setStrategy(new SubtractionStrategy());
        } else {
            context.setStrategy(new MultiplicationStrategy());
        }

        System.out.println("Execution result = " + context.executeStrategy(10, 15));
    }
}