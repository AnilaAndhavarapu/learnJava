package com.learning.java.Threads.Semaphores;

import java.util.concurrent.Semaphore;

public class DriverClass {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Task(semaphore);
            Thread thread = new Thread(runnable);
            thread.setName("Thread - " + i);
            thread.start();
        }


    }
}
