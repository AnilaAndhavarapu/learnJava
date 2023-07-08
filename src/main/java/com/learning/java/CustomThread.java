package com.learning.java;

public class CustomThread extends Thread{

    public void run(){
        System.out.println("Custom Thread run called : " + Thread.currentThread().getName());
    }
}
