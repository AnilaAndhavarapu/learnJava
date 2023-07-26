package com.learning.java.Threads.Futures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class DriverClass2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<FutureTask<Integer>> futureTaskList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Callable<Integer> callableTask = new TimedCallableTask(new Random().nextInt(10), "TimedCallableTask - " + i);
            FutureTask<Integer> futureTask = new FutureTask<>(callableTask);
            futureTaskList.add(futureTask);
            Thread thread = new Thread(futureTask);
            thread.setName("TimedCallableTask - " + i);
            thread.start();
        }

        System.out.println("Sleeping on main thread");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Sleep completed on main thread");

        for (int i = 0; i < futureTaskList.size(); i++) {
            FutureTask<Integer> futureTask = futureTaskList.get(i);
            while (! futureTask.isDone()){
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName() + ":: Waiting for future result of : " + i);
            }
            int value = futureTask.get();
            System.out.println(Thread.currentThread().getName() + ":: Future result of : " + i + " is : " + value);
        }
    }
}
