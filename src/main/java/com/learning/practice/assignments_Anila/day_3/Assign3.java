package com.learning.practice.assignments_Anila.day_3;

import com.learning.practice.utils.Utils;

import java.util.ArrayList;

public class Assign3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = Utils.generateRandomIntegers(20);
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);
        int i = 0;

        for (i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            } else if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("min: " + min + " max: " + max + " diff: " + (max - min));
    }


    // print list
    // print min num, max num and difference of min and max number

}

