package com.learning.java.Threads.Futures;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class DriverClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Runnable runnableTask = new RunnableTask();
        Thread thread1 = new Thread(runnableTask);
        thread1.setName("RunnableThread");
        thread1.start();


        Callable<Integer> callableTask = new CallableTask();
        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);
        Thread thread2 = new Thread(futureTask);
        thread2.setName("CallableThread");
        thread2.start();

       while (! futureTask.isDone()){
           TimeUnit.SECONDS.sleep(1); // Same as Thread.sleep(1000)
           System.out.println(Thread.currentThread().getName() + ":: Waiting for future result");
       }
        int value = futureTask.get();
        System.out.println(Thread.currentThread().getName() + ":: Future result : " + value);

    }
}

