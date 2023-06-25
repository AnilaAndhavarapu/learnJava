package com.learn.java.practice.assignments_Janhavi.day_1;

import com.learn.java.practice.vo.Student;

import java.util.*;

public class Assign1 {

    public static void main(String[] args) {

        List<Student> studentList = getListOfStudents(10);
        System.out.println(studentList);
        System.out.println("Sorting the students");

        // Sort the above list on Names first and then if the names are same sort it by roll number.
        Iterator<Student> custIterator = studentList.iterator();
        Collections.sort(studentList, new CustomComparator1());
        System.out.println(studentList);
    }

    private static List<Student> getListOfStudents(int count){
        List<Student> list = new ArrayList<>();
        String[] names = new String[]{"Pingu", "Tingu", "Mangu", "Jingu", "Lingu"};
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(new Student(i + 1, names[random.nextInt(4)]));
        }
        return list;

    }

}
