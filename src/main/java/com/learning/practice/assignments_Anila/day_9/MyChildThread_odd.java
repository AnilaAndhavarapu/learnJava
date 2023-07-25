package com.learning.practice.assignments_Anila.day_9;

public class MyChildThread_odd implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            notify();
        }
    }
}
