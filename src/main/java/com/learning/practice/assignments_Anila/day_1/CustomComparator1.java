package com.learning.practice.assignments_Anila.day_1;

import com.learning.practice.vo.Student;

import java.util.Comparator;

class CustomComparator1 implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        String name1 = s1.getName();
        String name2 = s2.getName();
        int nameCompare = name1.compareTo(name2);
        int rollNumCompare = s1.getRollNum() - s2.getRollNum();
        return (nameCompare == 0) ? rollNumCompare : nameCompare;
    }
}
