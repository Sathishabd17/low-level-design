package org.system.design.lld.subscriber;

public class SmsNotificationSubscriber implements Subscriber {
    private final Long mobileNumber;

    public SmsNotificationSubscriber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(String eventType, String data) {
        System.out.println(this.getClass().getName() + " SMS to " + this.mobileNumber + ": You have received new event= " + eventType + " with the data= " + data);
    }
}
