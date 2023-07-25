package com.learning.java.Threads;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {
        CustomThread th1 = new CustomThread();
        th1.start();
        th1.setPriority(Thread.MAX_PRIORITY);
        th1.setName("ABC");

        //Thread.sleep(2000);
        th1.interrupt();

//        Thread th2 = new Thread(new CustomRunnable());
//        th2.start();
//        th2.setPriority(Thread.MIN_PRIORITY);
//        th2.setName("DEF");
    }
}
