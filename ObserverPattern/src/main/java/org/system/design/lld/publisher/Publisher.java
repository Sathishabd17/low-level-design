package org.system.design.lld.publisher;

import org.system.design.lld.topic.Topic;

import java.util.List;

public class Publisher {

    private final List<Topic> topics;

    public Publisher(List<Topic> topics) {
        this.topics = topics;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void removeTopic(Topic topic) {
        topics.remove(topic);
    }

    public void publishEvent(String eventType, String data, List<Topic> topicList) {
        for (Topic topic : topics) {
            if (topicList.contains(topic))
                topic.receiveEvent(eventType, data, this);
        }
    }


}
