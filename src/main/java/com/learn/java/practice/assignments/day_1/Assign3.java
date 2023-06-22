package com.learn.java.practice.assignments.day_1;

import com.learn.java.practice.vo.Employee;

import java.util.ArrayList;
import java.util.Random;

public class Assign3 {

    public static void main(String[] args) {
        ArrayList<Employee> empList = getEmployeeList(15);
        // write a method which will filter the employees based on dept in sorted order by emp id.
        // Example :: ArrayList<Employee> techEmployees = getEmployeesOfDept("Tech");
        // print list of employees of each dept using above function
        ArrayList<Employee> hrEmployeeList = getEmployeesOfDept(empList, "HR");
        System.out.println("Employee List: " + empList);
        System.out.println("HR List: " + hrEmployeeList);
    }

    private static ArrayList<Employee> getEmployeesOfDept(ArrayList<Employee> employeeList, String department) {
        // write the implementation
        ArrayList<Employee> result = new ArrayList<>();

        for (int i = 0; i < employeeList.size(); i++) {
            if (department.equals(employeeList.get(i).getDept())) {
                result.add(employeeList.get(i));
            }
        }
        return result;
    }

    private static ArrayList<Employee> getEmployeeList(int count) {
        ArrayList<Employee> list = new ArrayList<>();
        String[] names = new String[]{"Pingu", "Tingu", "Mangu", "Jingu", "Lingu"};
        String[] dept = new String[]{"Finance", "Tech", "Marketing", "Customer Relations", "HR"};
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(new Employee(i + 1, names[random.nextInt(5)], dept[random.nextInt(5)]));
        }
        return list;
    }
}
