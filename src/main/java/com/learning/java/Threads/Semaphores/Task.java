package com.learning.java.Threads.Semaphores;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

    Semaphore semaphore;
    public Task(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ":: Semaphore available permits : " + semaphore.availablePermits());
            System.out.println(ANSI_BLUE + Thread.currentThread().getName() + ":: Waiting for acquiring permit" + ANSI_RESET);
            semaphore.acquire();
            System.out.println(GREEN_BACKGROUND + Thread.currentThread().getName() + ":: Acquired permit" + ANSI_RESET);
            TimeUnit.SECONDS.sleep(5);
            int num = new Random().nextInt(100);
            System.out.println(Thread.currentThread().getName() + ":: generated number : " + num);
            semaphore.release();
            System.out.println(GREEN_BACKGROUND + Thread.currentThread().getName() + ":: Released permit" + ANSI_RESET);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ":: is interrupted");
        }
    }
}
