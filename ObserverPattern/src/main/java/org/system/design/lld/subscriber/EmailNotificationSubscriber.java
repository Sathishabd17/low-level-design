package org.system.design.lld.subscriber;

public class EmailNotificationSubscriber implements Subscriber {
    private final String email;

    public EmailNotificationSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String data) {
        System.out.println(this.getClass().getName() + " Email to " + this.email + ": You have received new event= " + eventType + " with the data= " + data);
    }
}
