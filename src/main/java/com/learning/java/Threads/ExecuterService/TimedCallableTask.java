package com.learning.java.Threads.ExecuterService;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TimedCallableTask implements Callable<Integer> {
    int waitTime;
    public TimedCallableTask(int waitTime, String name){
        this.waitTime = waitTime;
        System.out.println(name + ":: Initialized with timeout : " + waitTime);
    }
    @Override
    public Integer call() {
        Random random = new Random();
        try {
            TimeUnit.SECONDS.sleep(waitTime);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ":: Interrupted Exception thrown");
        }
        return random.nextInt(100);
    }
}
