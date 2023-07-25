package com.learning.practice.assignments_Anila.day_9;

public class Assign_2 {
    int counter = 0;
    int n = 20;

    public static void main(String[] args) {
        Assign_2 as2 = new Assign_2();
        Thread my1 = new Thread(new Runnable() {
            @Override
            public void run() {
                as2.printEven();
            }
        });
        Thread my2 = new Thread(new Runnable() {
            @Override
            public void run() {
                as2.printOdd();
            }
        });
        my1.start();
        my2.start();
    }


    public void printEven() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    public void printOdd(){
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }
}

