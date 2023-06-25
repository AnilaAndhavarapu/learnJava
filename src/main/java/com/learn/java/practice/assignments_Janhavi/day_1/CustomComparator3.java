package com.learn.java.practice.assignments_Janhavi.day_1;

import com.learn.java.practice.vo.Employee;

import java.util.Comparator;

public class CustomComparator3 implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int EmpidComparator = o1.getEmpId()- o2.getEmpId();
        return EmpidComparator;
    }
}
