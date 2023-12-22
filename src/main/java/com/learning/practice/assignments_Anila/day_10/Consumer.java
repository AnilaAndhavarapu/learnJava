package com.learning.practice.assignments_Anila.day_10;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable{
    Inventory inv;
    Lock lock2 = new ReentrantLock();
    public Consumer(Inventory inventory){
        this.inv = inventory;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (inv){
                if(inv.queue.size() == 0){
                    System.out.println("Inventory is empty, consumer should wait");
                    try {
                        inv.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                inv.queue.remove();
                System.out.println("Product removed");
                System.out.println("Notify producer to produce");
                inv.notifyAll();
            }

        }
    }


}
