package com.learning.java.Threads.Synchronization;

public class DemoClass {
    
    private static final long TIMEOUT = 3 * 1000;

    public static void staticNonSync1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside static non sync method 1");
        Thread.sleep(TIMEOUT);
    }

    public static void staticNonSync2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside static non sync method 2");
        Thread.sleep(TIMEOUT);
    }

    public static synchronized void staticSync1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside static sync method 1");
        Thread.sleep(TIMEOUT);
        System.out.println(Thread.currentThread().getName() + ":: Releasing static sync method 1 lock");
    }

    public static synchronized void staticSync2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside static sync method 2");
        Thread.sleep(TIMEOUT);
        System.out.println(Thread.currentThread().getName() + ":: Releasing static sync method 2 lock");
    }

    public void instanceNonSync1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside instance non sync method 1");
        Thread.sleep(TIMEOUT);
    }

    public void instanceNonSync2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside instance non sync method 2");
        Thread.sleep(TIMEOUT);
    }

    public synchronized void instanceSync1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside instance sync method 1");
        Thread.sleep(TIMEOUT);
        System.out.println(Thread.currentThread().getName() + ":: Releasing instance sync method 1 lock");
    }

    public synchronized void instanceSync2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ":: Inside instance sync method 2");
        Thread.sleep(TIMEOUT);
        System.out.println(Thread.currentThread().getName() + ":: Releasing instance sync method 2 lock");
    }
}
