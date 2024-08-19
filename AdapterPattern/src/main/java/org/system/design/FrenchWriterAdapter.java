package org.system.design;

public class FrenchWriterAdapter implements Writer {
    private final FrenchService frenchService;

    public FrenchWriterAdapter(FrenchService frenchService) {
        this.frenchService = frenchService;
    }

    @Override
    public void writeMessage(String message) {
        frenchService.writeFrenchMessage(message);
    }
}
