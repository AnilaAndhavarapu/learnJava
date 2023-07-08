package com.learning.practice.assignments_Anila.day_3;

import com.learning.practice.utils.Utils;

import java.util.Arrays;

public class Assign4 {

    public static void main(String[] args) {
        String str = Utils.getRandomSentence(7);
        System.out.println(str);
        String[] str1 = str.split(" ");

        int i = 0;
        int j = str1.length-1;
        String temp;

        while (i < j) {
            temp = str1[i];
            str1[i] = str1[j];
            str1[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(str1));


        // reverse the above string word by word and print it.
        // Example : yoga elephant quail insect ocean
        // Output : ocean insect quail elephant yoga


    }
}
