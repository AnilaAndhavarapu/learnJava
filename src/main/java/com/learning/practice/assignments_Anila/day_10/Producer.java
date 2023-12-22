package com.learning.practice.assignments_Anila.day_10;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable{
     Inventory inv;
    Lock lock1 = new ReentrantLock();
     public Producer(Inventory inventory){
        this.inv = inventory;
     }


    @Override
    public void run() {
        while(true) {
            synchronized (inv){
                if(inv.queue.size() == inv.MAX_SIZE) {
                    System.out.println("Inventory is full, producer should wait");
                    try {
                        inv.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                inv.queue.add(1);
                System.out.println("Product added");
                System.out.println("Notify consumer to consume");
                inv.notifyAll();
            }
        }
    }
}
