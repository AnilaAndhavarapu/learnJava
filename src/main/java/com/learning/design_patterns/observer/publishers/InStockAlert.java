package com.learning.design_patterns.observer.publishers;

import com.learning.design_patterns.observer.vo.Notification;
import com.learning.design_patterns.observer.subscribers.ISubscriber;

import java.util.ArrayList;
import java.util.List;

public class InStockAlert implements IPublisher{

   private final List<ISubscriber> subscribers = new ArrayList<>();

   private String data;

    private String name;

    public InStockAlert(String name) {
        this.name = name;
    }

    @Override
    public String addSubscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
        return subscriber.toString() + " subscribed successfully";
    }

    @Override
    public String removeSubscriber(ISubscriber subscriber) {
        subscribers.remove(subscriber);
        return subscriber.toString() + " unsubscribed successfully";
    }

    @Override
    public void notifySubscribers(String message) {
        Notification notification = new Notification(this, message);
        subscribers.forEach(s -> s.update(notification));
    }

    @Override
    public void setData(String data) {
        this.data = data;
        notifySubscribers(data);
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public String getName() {
        return name;
    }
}
