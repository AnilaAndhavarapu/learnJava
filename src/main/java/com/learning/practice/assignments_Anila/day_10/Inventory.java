package com.learning.practice.assignments_Anila.day_10;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Inventory {
     int MAX_SIZE = 4;
     Queue<Integer> queue = new ArrayDeque<>(MAX_SIZE);

    Lock lock2 = new ReentrantLock();
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Runnable p = new Producer(inv);
        Runnable c = new Consumer(inv);
        Thread tp = new Thread(p);
        Thread tc = new Thread(c);
        tp.start();
        tc.start();
    }
}