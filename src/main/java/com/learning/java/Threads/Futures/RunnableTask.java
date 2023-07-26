package com.learning.java.Threads.Futures;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + ":: Generated integer value : " + random.nextInt(100));
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ":: Interrupted Exception thrown");
        }
    }
}
