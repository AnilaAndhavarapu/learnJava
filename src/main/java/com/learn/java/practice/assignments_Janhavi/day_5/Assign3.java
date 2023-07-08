package com.learn.java.practice.assignments_Janhavi.day_5;

public class Assign3 {
    public static void main(String[] args) {
        Assign3 as = new Assign3();
        String num = "789";
        as.toInteger(num);
        // convert string num into integer without using parseInt method
    }

    public void toInteger(String s) {
        char ch[] = s.toCharArray();
        int result = 0;
        for (int i = 0; i < ch.length; i++) {
            char ch1 = ch[i];
            result = result * 10 + ch1 - '0';
        }
        System.out.println("result" + result);
    }
}