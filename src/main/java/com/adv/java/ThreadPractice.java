package com.adv.java;

public class ThreadPractice {

    public static void main(String[] args) {

        // Thread by extending thread class
        CustomThread th1 = new CustomThread();
        th1.start(); // using start method of thread class which in turn calls run method

        // Thread by implementing runnable interface
        Thread th2 = new Thread(new CustomRunnable());
        th2.start();

        //Runnable using Lambda expr
        Runnable lambdaRunnableObject = () -> System.out.println("Lambda Runnable object");
        Thread th3 = new Thread(lambdaRunnableObject);
        th3.start();

        Thread th4 = new Thread(() -> System.out.println("Inner Lambda object"));
        th4.start();
    }
}
