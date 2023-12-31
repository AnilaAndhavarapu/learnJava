package com.learning.practice.vo;

import java.util.Objects;

public class Student implements Comparable<Student>{

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
        return "{" +
                "" + rollNum +
                ", '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNum() == student.getRollNum() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNum(), getName());
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return ((Integer) this.rollNum).compareTo(anotherStudent.getRollNum());
    }
}
