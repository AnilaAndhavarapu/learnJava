package com.learning.java.Threads.Initialization;

public class ThreadInterruptTest {

    public static void main(String[] args) {
        new Task().start();
        //th.interrupt();
        System.out.println("main ended");
    }
}

class Task extends Thread {
    public void run(){
        try {
            for (int i = 0; i < 100; i++){
                System.out.println("Child thread is running " + i);
                if(isInterrupted()){
                    System.out.println("In interrupt block");
                    throw new InterruptedException();
                }
                System.out.println("Waiting " + i);
                wait(1000);
            }
        } catch (Exception e) {
            if(isInterrupted()){
                Thread.currentThread().interrupted();
                System.out.println("Thread interrupted");
            }
            System.out.println("Exception " + e.getClass());
        }
    }
}
