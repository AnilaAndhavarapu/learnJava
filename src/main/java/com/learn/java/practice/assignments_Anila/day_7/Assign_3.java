package com.learn.java.practice.assignments_Anila.day_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  Assign_3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,2,1,1,1,2,2);
        // find the majority element in the list
        // Majority element is the number which occurs maximum number of times in the list
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i = 0; i < list.size(); i++){
            if(hm.containsKey(list.get(i))){
               hm.put(list.get(i), hm.get(list.get(i))+1);
            }
            else{
                hm.put(list.get(i), 1);
            }
        }
        System.out.println(hm);
        int max = hm.get(0);
        for(int i = 1; i < hm.size(); i++){
            if(max < hm.get(i)){
                max = hm.get(i);
            }
        }
        System.out.println(max);
    }
}
