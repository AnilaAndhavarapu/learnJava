package com.learn.java.practice.practice;

import com.learn.java.practice.vo.Student;
import com.learn.java.practice.utils.Utils;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {
        ArrayList<Integer> list = Utils.generateRandomIntegers(10);
        System.out.println(list);

        ArrayList<String> list1 = Utils.generateRandomStrings(10);
        System.out.println(list1);

        Student student = new Student(10, "Pingu");
        System.out.println(student.getRollNum());

    }
}
