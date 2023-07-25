package com.learning.java.Threads.Synchronization;

public class DriverClass {

    public static void main(String[] args) {
        DemoClass obj = new DemoClass();

        // Instance Sync ---------------------------------------------------------------------------------------------------
        Runnable syncInstance1Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire sync instance lock...");
                    obj.instanceSync1();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable syncInstance2Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire sync instance lock...");
                    obj.instanceSync2();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        // Instance Non-Sync -----------------------------------------------------------------------------------------------
        Runnable nonSyncInstance1Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire non-sync instance lock...");
                    obj.instanceNonSync1();
                    System.out.println(Thread.currentThread().getName() + ":: Released non-sync instance lock and exec completed");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable nonSyncInstance2Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire non-sync instance lock...");
                    obj.instanceNonSync2();
                    System.out.println(Thread.currentThread().getName() + ":: Released non-sync instance lock and exec completed");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        // Static Sync ---------------------------------------------------------------------------------------------------
        Runnable syncStatic1Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire sync static lock...");
                    DemoClass.staticSync1();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable syncStatic2Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire sync static lock...");
                    DemoClass.staticSync2();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        // Static Non-Sync -----------------------------------------------------------------------------------------------
        Runnable nonSyncStatic1Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire non-sync static lock...");
                    DemoClass.staticNonSync1();
                    System.out.println(Thread.currentThread().getName() + ":: Released non-sync static lock and exec completed");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable nonSyncStatic2Runnable = () -> {
            try {
                while(true){
                    System.out.println(Thread.currentThread().getName() + ":: Trying to acquire non-sync static lock...");
                    DemoClass.staticNonSync2();
                    System.out.println(Thread.currentThread().getName() + ":: Released non-sync static lock and exec completed");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

       //Driver Actions ------------------------------------------------------------------------------------------------------

        int SYNC_INSTANCE_COUNT = 0;
        int NON_SYNC_INSTANCE_COUNT = 0;
        int SYNC_STATIC_COUNT = 1;
        int NON_SYNC_STATIC_COUNT = 0;

        for (int i = 0; i < SYNC_INSTANCE_COUNT; i++) {
            Thread thread1 = new Thread(syncInstance1Runnable);
            thread1.setName("SYNC_INSTANCE_THREAD_M1-" + i);
            Thread thread2 = new Thread(syncInstance2Runnable);
            thread2.setName("SYNC_INSTANCE_THREAD_M2-" + i);
            thread1.start();
            thread2.start();
        }

        for (int i = 0; i < NON_SYNC_INSTANCE_COUNT; i++) {
            Thread thread1 = new Thread(nonSyncInstance1Runnable);
            thread1.setName("NON_SYNC_INSTANCE_THREAD_M1-" + i);
            Thread thread2 = new Thread(nonSyncInstance2Runnable);
            thread2.setName("NON_SYNC_INSTANCE_THREAD_M2-" + i);
            thread1.start();
            thread2.start();
        }

        for (int i = 0; i < SYNC_STATIC_COUNT; i++) {
            Thread thread1 = new Thread(syncStatic1Runnable);
            thread1.setName("SYNC_STATIC_THREAD_M1-" + i);
            Thread thread2 = new Thread(syncStatic2Runnable);
            thread2.setName("SYNC_STATIC_THREAD_M2-" + i);
            thread1.start();
            thread2.start();
        }

        for (int i = 0; i < NON_SYNC_STATIC_COUNT; i++) {
            Thread thread1 = new Thread(nonSyncStatic1Runnable);
            thread1.setName("NON_SYNC_STATIC_THREAD_M1-" + i);
            Thread thread2 = new Thread(nonSyncStatic2Runnable);
            thread2.setName("NON_SYNC_STATIC_THREAD_M2-" + i);
            thread1.start();
            thread2.start();
        }
    }
}
