package com.learning.java.Threads.ExecuterService;

import com.learning.java.Threads.Futures.TimedCallableTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class DriverClass2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Callable<Integer> callableTask = new TimedCallableTask(new Random().nextInt(10), "Thread-" + i);
            futureList.add(executor.submit(callableTask));
        }

        System.out.println("Sleeping on main thread");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Woke up main thread");

        for (int i = 0; i < futureList.size(); i++) {
            Future<Integer> future = futureList.get(i);
            while (! future.isDone()){
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName() + ":: Waiting for future result of : Thread-" + i);
            }
            int value = future.get();
            System.out.println(Thread.currentThread().getName() + ":: Future result of : Thread-" + i + " is : " + value);
        }

        executor.shutdown();
    }
}
