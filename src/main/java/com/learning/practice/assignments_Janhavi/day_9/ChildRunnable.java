package com.learning.practice.assignments_Janhavi.day_9;

public class ChildRunnable implements Runnable{


    volatile static boolean flag = true;
    @Override
    public void run() {
        while(flag){
            System.out.println(" ---> thread is running :: " + Thread.currentThread().getName());
        }
    }
    public static void stopIt(){
        flag = false;
        System.out.println("Child Thread flag is turned off :: " + Thread.currentThread().getName());
    }

    public static void startIt(){
        flag = true;
        System.out.println("Child Thread flag is turned on :: " + Thread.currentThread().getName());
    }
}
