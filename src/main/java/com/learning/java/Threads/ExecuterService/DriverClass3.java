package com.learning.java.Threads.ExecuterService;

import com.learning.java.Threads.Futures.TimedCallableTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class DriverClass3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futureList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Callable<Integer> callableTask = new TimedCallableTask(new Random().nextInt(10), "Thread-" + i);
            futureList.add(executor.submit(callableTask));
        }

        System.out.println("Sleeping on main thread");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Woke up main thread");

        List<Runnable> inCompleteTasks = executor.shutdownNow();
        System.err.println("IncompleteTasks : " + inCompleteTasks.size());

    }
}
