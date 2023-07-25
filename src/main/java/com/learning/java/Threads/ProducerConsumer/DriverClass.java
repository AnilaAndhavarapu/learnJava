package com.learning.java.Threads.ProducerConsumer;

public class DriverClass {

    private static final int PRODUCER_COUNT = 1;
    private static final int CONSUMER_COUNT = 5;

    private static final long PRODUCER_WAIT_TIME_MILL = 2 * 1000;
    private static final long CONSUMER_WAIT_TIME_MILL = 1 * 1000;
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        for (int i = 0; i < PRODUCER_COUNT; i++) {
            Runnable producerRunnable = new Producer(inventory, PRODUCER_WAIT_TIME_MILL);
            Thread producerThread = new Thread(producerRunnable);
            producerThread.setName("Producer - " + i);
            producerThread.start();
        }

        for (int i = 0; i < CONSUMER_COUNT; i++) {
            Runnable consumerRunnable = new Consumer(inventory, CONSUMER_WAIT_TIME_MILL);
            Thread consumerThread = new Thread(consumerRunnable);
            consumerThread.setName("Consumer - " + i);
            consumerThread.start();
        }
    }
}
