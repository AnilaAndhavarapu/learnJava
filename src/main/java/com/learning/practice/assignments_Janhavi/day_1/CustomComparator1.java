package com.learning.practice.assignments_Janhavi.day_1;

import com.learning.practice.vo.Student;

import java.util.Comparator;

class CustomComparator1 implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int nameCompare = s1.getName().compareTo(s2.getName());
        int rollNumCompare = s1.getRollNum() - s2.getRollNum();
        return (nameCompare == 0) ? rollNumCompare : nameCompare;
    }
}
