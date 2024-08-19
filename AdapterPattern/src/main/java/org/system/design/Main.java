package org.system.design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String message = "Hello world!";
        System.out.println("Writing message in english: " + message);

        FrenchWriterAdapter frenchWriterAdapter = new FrenchWriterAdapter(new FrenchService());
        SpanishWriterAdapter spanishWriterAdapter = new SpanishWriterAdapter(new SpanishService());
        frenchWriterAdapter.writeMessage(message);
        spanishWriterAdapter.writeMessage(message);

    }
}