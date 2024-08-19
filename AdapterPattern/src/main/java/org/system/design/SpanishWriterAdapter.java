package org.system.design;

public class SpanishWriterAdapter implements Writer {
    private final SpanishService spanishService;

    public SpanishWriterAdapter(SpanishService spanishService) {
        this.spanishService = spanishService;
    }

    @Override
    public void writeMessage(String message) {
        spanishService.writeSpanishMessage(message);
    }
}
