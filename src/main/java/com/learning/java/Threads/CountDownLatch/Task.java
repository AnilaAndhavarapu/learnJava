package com.learning.java.Threads.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

    int delay;
    CountDownLatch latch;
    public Task(int delay, CountDownLatch latch) {
        this.delay = delay;
        this.latch = latch;
    }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(delay);
            System.out.println(Thread.currentThread().getName() + ":: Initial Prep done in : " + delay);
            System.out.println(Thread.currentThread().getName() + ":: latch down");
            latch.countDown();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ":: is interrupted");
        }
    }
}
