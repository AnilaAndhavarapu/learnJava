package com.learning.java.Threads.Initialization;

import java.util.concurrent.atomic.AtomicInteger;

public class CustomThread extends Thread {

    public void run() {
        AtomicInteger num = new AtomicInteger();
        for (int i = 0; i < 10; i++) {
            System.out.println("Custom Thread loop count : " + i);
            try {
                Thread.sleep(500);
                if(Thread.currentThread().isInterrupted()){
                    throw new InterruptedException("Custom exit");
                }
            } catch (InterruptedException e) {
                System.out.println("Exception msg : " + e.getMessage());
                System.out.println("Exiting Thread " + Thread.currentThread().getName());
                break;
            }
        }
        System.out.println("Custom Thread run finished : " + Thread.currentThread().getName());
    }
}
