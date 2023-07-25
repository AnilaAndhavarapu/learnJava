package com.learning.java.Threads.DeadLock;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Inventory {

    private Lock lock = new ReentrantLock();
    private Condition added = lock.newCondition();
    private Condition removed = lock.newCondition();
    int MAX_SIZE = 10;
    private Queue<Integer> inventory = new ArrayDeque<>(MAX_SIZE);
    public void produce(){
        System.out.println(Thread.currentThread().getName() + ":: Waiting for Acquiring lock in produce method ... ");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + ":: Acquired lock in produce method");
        try{
            while(inventory.size() == MAX_SIZE){
                System.out.println(Thread.currentThread().getName() + ":: Awaiting removed condition ...");
                Thread.sleep(1000);
                //removed.await();
            }
            int val = new Random().nextInt(100);
            inventory.offer(val);
            //added.signalAll();
            System.out.println(Thread.currentThread().getName() + ":: Produced " + val + " to inventory and signaled added condition");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + ":: is interrupted");
        }finally {
            if(! Thread.currentThread().isInterrupted()){
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + ":: Released lock in produce method");
            }
        }
    }

    public void consume() {
        System.out.println(Thread.currentThread().getName() + ":: Waiting for Acquiring lock in consume method ... ");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + ":: Acquired lock in consume method");
        try{
            while(inventory.size() == 0){
                System.out.println(Thread.currentThread().getName() + ":: Awaiting added condition ...");
                Thread.sleep(1000);
                //added.await();
            }
            int val = inventory.poll();
            //removed.signalAll();
            System.out.println(Thread.currentThread().getName() + ":: Consumed " + val + " from inventory and signaled removed condition");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + ":: is interrupted");
        }finally {
            if(! Thread.currentThread().isInterrupted()){
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + ":: Released lock in consume method");
            }
        }
    }

}
