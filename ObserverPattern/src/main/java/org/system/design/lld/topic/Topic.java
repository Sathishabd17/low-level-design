package org.system.design.lld.topic;

import org.system.design.lld.publisher.Publisher;
import org.system.design.lld.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    protected List<Subscriber> subscribers = new ArrayList<>();

    public void subscribeTopic(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribeTopic(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void receiveEvent(String eventType, String data, Publisher publisher) {
        System.out.println(this.getClass().getName() + " Received new event eventType = " + eventType + ", data = " + data + ", from publisher = " + publisher);
        for(Subscriber subscriber : subscribers) {
            subscriber.update(eventType, data);
        }
    }


}
