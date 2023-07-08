package com.learn.java.practice.assignments_Anila.day_1;

import java.util.Comparator;

public class CustomComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

}
