package com.learning.design_patterns.observer.subscribers;

import com.learning.design_patterns.observer.vo.Notification;

public interface ISubscriber {

    void update(Notification notification);

    String getName();
}
