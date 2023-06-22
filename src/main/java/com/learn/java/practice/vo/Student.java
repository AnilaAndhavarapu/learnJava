package com.learn.java.practice.vo;

public class Student {

    private int rollNum;
    private String name;


    public Student(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                '}';
    }

}
