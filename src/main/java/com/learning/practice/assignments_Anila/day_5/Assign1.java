package com.learning.practice.assignments_Anila.day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assign1 {

    public static void main(String[] args) {
        // create a method which will take a list<String> as input
        // and returns a list of distinct Strings
        // Note: you cannot use list.contains method
        // explore suitable algo / Data Structure for above
        List<String> stringList = Arrays.asList("Pingu", "Tingu", "Jingu", "Tingu", "Mangu");
        System.out.println(stringList);
        System.out.println(distinctStrings(stringList));
    }

    public static ArrayList<String> distinctStrings(List<String> objList) {
        ArrayList<String> distinctList = new ArrayList<>();
        pinguLoop:
        for (int i = 0; i < objList.size(); i++) {
            for (int j = 0; j < distinctList.size(); j++) {
                if (distinctList.get(j).equals(objList.get(i))) {
                    continue pinguLoop;
                }
            }
            distinctList.add(objList.get(i));
        }
        return distinctList;
    }
}
