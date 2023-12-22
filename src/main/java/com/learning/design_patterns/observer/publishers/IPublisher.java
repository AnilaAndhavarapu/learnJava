package com.learning.design_patterns.observer.publishers;

import com.learning.design_patterns.observer.subscribers.ISubscriber;

import java.util.ArrayList;
import java.util.List;

public interface IPublisher {

    String addSubscriber(ISubscriber subscriber);

    String removeSubscriber(ISubscriber subscriber);

    void notifySubscribers(String message);

    void setData(String data);

    String getData();

    String getName();

}
