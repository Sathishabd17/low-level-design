package org.system.design.lld.subscriber;

public class LoggingSubscriber implements Subscriber {
    private final String logFile;

    public LoggingSubscriber(String logFile) {
        this.logFile = logFile;
    }

    @Override
    public void update(String eventType, String data) {
        System.out.println(this.getClass().getName() + " Logging to " + this.logFile + ": New event= " + eventType + " received with the data= " + data);
    }
}
