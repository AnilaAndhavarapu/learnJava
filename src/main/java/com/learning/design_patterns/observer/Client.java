package com.learning.design_patterns.observer;

import com.learning.design_patterns.observer.publishers.IPublisher;
import com.learning.design_patterns.observer.publishers.InStockAlert;
import com.learning.design_patterns.observer.subscribers.EcommerceUser;
import com.learning.design_patterns.observer.subscribers.ISubscriber;

public class Client {

    public static void main(String[] args) {
        IPublisher stockAlert1 = new InStockAlert("PS5");
        IPublisher stockAlert2 = new InStockAlert("Xbox");
        IPublisher stockAlert3 = new InStockAlert("Nintendo");

        ISubscriber user1 = new EcommerceUser("user1");
        ISubscriber user2 = new EcommerceUser("user2");
        ISubscriber user3 = new EcommerceUser("user3");
        ISubscriber user4 = new EcommerceUser("user4");
        ISubscriber user5 = new EcommerceUser("user5");

        stockAlert1.addSubscriber(user1);
        stockAlert1.addSubscriber(user2);

        stockAlert2.addSubscriber(user1);
        stockAlert2.addSubscriber(user2);
        stockAlert2.addSubscriber(user3);
        stockAlert2.addSubscriber(user4);

        stockAlert3.addSubscriber(user4);
        stockAlert3.addSubscriber(user5);

        stockAlert1.setData("In Stock");
        System.out.println("\n\n");

        stockAlert2.setData("Out Of Stock");
        System.out.println("\n\n");

        stockAlert3.setData("Only Few Left");
        System.out.println("\n\n");

        stockAlert1.setData("Only 2 Left in Stock");
        System.out.println("\n\n");

    }
}
