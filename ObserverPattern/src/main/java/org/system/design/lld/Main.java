package org.system.design.lld;

import org.system.design.lld.publisher.Publisher;
import org.system.design.lld.subscriber.EmailNotificationSubscriber;
import org.system.design.lld.subscriber.LoggingSubscriber;
import org.system.design.lld.subscriber.SmsNotificationSubscriber;
import org.system.design.lld.subscriber.Subscriber;
import org.system.design.lld.topic.ProductInventoryStatusTopic;
import org.system.design.lld.topic.ProductStatusTopic;
import org.system.design.lld.topic.Topic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Publisher publisher = new Publisher(new ArrayList<>());

        Topic productStatusTopic = new ProductStatusTopic();
        Topic productInventoryStatusTopic = new ProductInventoryStatusTopic();
        publisher.addTopic(productStatusTopic);
        publisher.addTopic(productInventoryStatusTopic);

        Subscriber emailNotificationSubscriber = new EmailNotificationSubscriber("test@gmail.com");
        Subscriber smsNotificationSubscriber = new SmsNotificationSubscriber(439856138456L);
        Subscriber loggingSubscriber = new LoggingSubscriber("test.txt");

        productStatusTopic.subscribeTopic(emailNotificationSubscriber);
        productStatusTopic.subscribeTopic(smsNotificationSubscriber);
        productStatusTopic.subscribeTopic(loggingSubscriber);

        productInventoryStatusTopic.subscribeTopic(emailNotificationSubscriber);
        productInventoryStatusTopic.subscribeTopic(loggingSubscriber);

        publisher.publishEvent("Product delivery", "Product ready for delivery", List.of(productStatusTopic));
        publisher.publishEvent("Product added", "New product added to the inventory", List.of(productInventoryStatusTopic));
    }
}