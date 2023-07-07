package com.learn.java.practice.assignments_Anila.day_8;

import java.util.ArrayList;
import java.util.List;

public class Assign_2 {

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s.length());
        // create a string list of all possible substrings in O(N2)
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                stringList.add(s.substring(i,j));

            }
        }
        System.out.println(stringList);
    }
}
