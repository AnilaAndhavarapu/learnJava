package com.learning.java.Threads.Initialization;

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
