package com.learning.java;

public class CustomRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("CustomRunnableThread run called");
    }
}