package com.learning.practice.assignments_Anila.day_1;

import com.learning.practice.vo.Student;

import java.util.*;

public class Assign1 {

    public static void main(String[] args) {
        List<Student> studentList = getListOfStudents(10);
        System.out.println(studentList);
        System.out.println("Sorting the students");

        // Sort the above list on Names first and then if the names are same sort it by roll number.
        CustomComparator1 comp1 = new CustomComparator1();
        Collections.sort(studentList);
        System.out.println("Using Comparable: " + studentList);
        Collections.sort(studentList, comp1);
        System.out.println("Using Custom Comparator " + studentList);
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
