package com.learning.practice.assignments_Anila.day_7;

import com.learning.practice.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Assign_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = Utils.generateRandomIntegers(10);
        Random r = new Random();
        int idx1 = r.nextInt(list.size());
        int idx2 = r.nextInt(list.size());
        int sum = list.get(idx1) + list.get(idx2);

        System.out.println(list);
        System.out.println("Sum : " + sum + " -- Idx1: " + idx1 + " -- Idx2: " + idx2);

        // Find the index of two numbers which when added is equal to sum
        // This should be solved in O(1) time complexity
        // print two indexes

        Map<Integer, Integer> hm = new HashMap<>();
        int[] str = new int[2];
        for(int i = 0; i < list.size(); i++){
            int res = sum - list.get(i);
            if(! hm.containsKey(res)){
               hm.put(list.get(i), i);
            }
            else{
                str[0] = hm.get(res);
                str[1] = i;
                System.out.println(hm.get(res));
                System.out.println(i);
            }
        }
        System.out.println(str);

    }
}
