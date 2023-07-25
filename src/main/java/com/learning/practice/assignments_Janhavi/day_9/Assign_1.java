package com.learning.practice.assignments_Janhavi.day_9;

public class Assign_1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("In main thread :: " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            ChildRunnable ct = new ChildRunnable();
            Thread th1 = new Thread(ct);
            th1.setName("Child thread - " + i);
            th1.start();
        }
        ChildRunnable.stopIt();

        System.out.println("Back to main thread :: " + Thread.currentThread().getName());
    }


}
