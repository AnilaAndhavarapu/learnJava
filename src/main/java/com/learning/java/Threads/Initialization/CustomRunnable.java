package com.learning.java.Threads.Initialization;

public class CustomRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("CustomRunnable " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupted();
                System.out.println("CustomRunnable got interrupted");
            }
        }
        System.out.println("CustomRunnableThread run called: " + Thread.currentThread().getName());
    }
}
