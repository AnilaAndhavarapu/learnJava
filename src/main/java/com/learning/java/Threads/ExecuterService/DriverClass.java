package com.learning.java.Threads.ExecuterService;

import com.learning.java.Threads.Futures.CallableTask;
import com.learning.java.Threads.Futures.RunnableTask;

import java.util.concurrent.*;

public class DriverClass {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Callable submit
        Callable<Integer> callableTask = new CallableTask();
        Future<Integer> future = executor.submit(callableTask);

        while (!future.isDone()){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Waiting for future result");
        }
        System.out.println("Future result : " + future.get());


        // Runnable execute
        RunnableTask runnableTask = new RunnableTask();
        executor.execute(runnableTask);


        // Always shutdown the executor at end
        executor.shutdown();
    }
}
