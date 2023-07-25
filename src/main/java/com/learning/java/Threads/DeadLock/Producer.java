package com.learning.java.Threads.DeadLock;

public class Producer implements Runnable{
    Inventory inventory;
    long wait;
    public Producer(Inventory inventory, long waitTime){
        this.inventory = inventory;
        wait = waitTime;
    }
    @Override
    public void run() {
        while(true){
            try {
                inventory.produce();
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ":: thrown InterruptedException in run method");
            }
        }
    }
}
