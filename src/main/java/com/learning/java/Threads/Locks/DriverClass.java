package com.learning.java.Threads.Locks;

import com.learning.practice.vo.Employee;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DriverClass {
    Lock writeLock = new ReentrantReadWriteLock().writeLock();
    Lock readLock = new ReentrantReadWriteLock().readLock();

    public static void main(String[] args) {
        Employee employee = new Employee(10, "Mangu", "Old Dept");
        DriverClass driver = new DriverClass();

        for (int i = 0; i < 3; i++) {
            Thread readThread = new Thread( new Task1(driver, employee));
            readThread.setName("Read Thread-" + i);

            Thread writeThread = new Thread( new Task2(driver, employee));
            writeThread.setName("Write Thread-" + i);

            readThread.start();
            writeThread.start();
        }
    }

    public  String getEmployeeId(Employee employee) throws InterruptedException {
        String dept;
        readLock.lock();
        System.out.println(Thread.currentThread().getName() + ":: Acquired read lock");
        TimeUnit.SECONDS.sleep(1);
        dept = employee.getDept();
        readLock.unlock();
        System.out.println(Thread.currentThread().getName() + ":: Released read lock");
        return dept;
    }

    public void updateEmployeeDept(Employee employee, String department) throws InterruptedException {
        writeLock.lock();
        System.out.println(Thread.currentThread().getName() + ":: Acquired write lock");
        TimeUnit.SECONDS.sleep(5);
        employee.setDept(department);
        writeLock.unlock();
        System.out.println(Thread.currentThread().getName() + ":: Released write lock");
    }

    public int getNum() throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition con = lock.newCondition();
        con.await();
        con.signal();
        con.awaitUninterruptibly();

        return 1;
    }
}
