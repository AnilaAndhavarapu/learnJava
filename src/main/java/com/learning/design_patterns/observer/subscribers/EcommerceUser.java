package com.learning.design_patterns.observer.subscribers;

import com.learning.design_patterns.observer.vo.Notification;

public class EcommerceUser implements ISubscriber{

    private String name;

    public EcommerceUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Notification notification) {
        System.out.println("Subscriber : " + name + " is being notified");
        System.out.println(notification.getPublisher().getName() +
                " alert :  " + notification.getPublisher().getData());
        System.out.println("*******************************************");
    }

    @Override
    public String getName() {
        return name;
    }

}
