package com.learning.java.Threads.ProducerConsumer;

public class Consumer implements Runnable{
    Inventory inventory;
    long wait;
    public Consumer(Inventory inventory, long waitTime){
        this.inventory = inventory;
        wait = waitTime;
    }
    @Override
    public void run() {
        while(true){
            try {
                inventory.consume();
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ":: thrown InterruptedException in run method");
            }
        }
    }
}
