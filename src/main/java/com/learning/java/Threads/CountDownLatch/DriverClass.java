package com.learning.java.Threads.CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class DriverClass {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Task(random.nextInt(15), latch));
            thread.setName("Player-" + i);
            thread.start();
        }

        System.out.println(Thread.currentThread().getName() + ":: Waiting for " + latch.getCount() + " Players.");
        latch.await();
        System.out.println(Thread.currentThread().getName() + ":: All Players in, starting the game now");

    }
}
