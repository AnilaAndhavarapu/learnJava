package com.learning.java;

public class ThreadPractice2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           CustomThread th = new CustomThread();
           th.setName(" Thread " + i);
           th.start();
        }
    }
}
