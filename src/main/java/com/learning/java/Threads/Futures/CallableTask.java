package com.learning.java.Threads.Futures;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() {
        Random random = new Random();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ":: Interrupted Exception thrown");
        }
        return random.nextInt(100);
    }
}
