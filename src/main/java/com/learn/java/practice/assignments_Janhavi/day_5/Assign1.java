package com.learn.java.practice.assignments_Janhavi.day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Assign1 {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Pingu", "Tingu", "Jingu", "Tingu", "Mangu");
        List<String> result = getDistinctString(stringList);
        System.out.println("Distinct list is"+ result);
        // create a method which will take a list<String> as input
        // and returns a list of distinct Strings
        // Note: you cannot use list.contains method
        // explore suitable algo / Data Structure for above
    }

    public static  List<String> getDistinctString (List<String> inputList)
    {
        List<String> result= new ArrayList<>();
        HashSet<String> DistinctString= new HashSet<String>();
        for(String str : inputList)
        {
            if(!DistinctString.contains(str))
            {
                DistinctString.add(str);
                result.add(str);
            }
        }

        return result;
    }
}
