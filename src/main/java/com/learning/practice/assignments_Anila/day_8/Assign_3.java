package com.learning.practice.assignments_Anila.day_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assign_3 {

    public static void main(String[] args) {
        String s = "xyzzaz";

        //Sub strings : "xyz", "yzz", "zza", and "zaz";
        // Find the substring with only unique chars.
        // Eg: "xyz" is a substring with all unique chars

        List<Character> cl= new ArrayList<>();
        outerloop:
        for(int i = 0; i < s.length(); i++) {
            for (int j = 0; j < cl.size(); j++) {
                if (cl.get(j).equals(s.charAt(i))){
                  continue outerloop;
                }
            }
            cl.add(s.charAt(i));
        }

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(cl);
    }
}
