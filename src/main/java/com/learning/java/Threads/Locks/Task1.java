package com.learning.java.Threads.Locks;

import com.learning.practice.vo.Employee;

public class Task1 implements Runnable {

    DriverClass driver;
    Employee emp;
    public Task1(DriverClass driver, Employee emp) {
        this.driver = driver;
        this.emp = emp;
    }

    @Override
    public void run() {
        try {
            driver.getEmployeeId(emp);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ":: is interrupted");
        }
    }
}
