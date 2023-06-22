package com.learn.java.practice.vo;

public class Employee {

    private int empId;
    private String empName;
    private String dept;

    public Employee(int empId, String empName, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dept='" + dept +
                '}';
    }
}
