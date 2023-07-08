package com.learning.practice.assignments_Anila.day_5;

public class Assign3 {
    public static void main(String[] args) {

        String num = "254";
        int result = 0;

        // convert string num into integer without using parseInt method
        for (int i = 0; i < num.length(); i++) {
            result = result * 10 + num.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
