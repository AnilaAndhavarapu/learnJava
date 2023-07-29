package com.learning.java.Threads.Locks;

import com.learning.practice.vo.Employee;

public class Task2 implements Runnable{

    DriverClass driver;
    Employee emp;
    public Task2(DriverClass driver, Employee emp) {
        this.driver = driver;
        this.emp = emp;
    }

    @Override
    public void run() {
        try {
            driver.updateEmployeeDept(emp, "New Dept");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + ":: is interrupted");
        }
    }
}
