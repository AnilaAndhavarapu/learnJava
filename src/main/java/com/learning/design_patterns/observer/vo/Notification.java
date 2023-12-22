package com.learning.design_patterns.observer.vo;

import com.learning.design_patterns.observer.publishers.IPublisher;

public class Notification {

    public IPublisher publisher;
    public String message;

    public Notification(IPublisher publisher, String message) {
        this.publisher = publisher;
        this.message = message;
    }

    public IPublisher getPublisher() {
        return publisher;
    }

    public void setPublisher(IPublisher publisher) {
        this.publisher = publisher;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
