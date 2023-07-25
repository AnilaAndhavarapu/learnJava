package com.learning.java.Threads;

import java.util.AbstractList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;

public class ThreadPractice2 {

    public static void main(String[] args) throws InterruptedException {
       CustomThread th = new CustomThread();
       th.setName(" Thread " + 1);
       th.start();
       th.interrupt();
       th.join();
       // AbstractList

    }
}
