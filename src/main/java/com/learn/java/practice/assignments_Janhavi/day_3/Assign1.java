package com.learn.java.practice.assignments_Janhavi.day_3;

import java.util.Scanner;

public class Assign1 {

    public static void main(String[] args) {
        System.out.println("enter input numbers");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += scan.nextInt();
            num--;
        }
        System.out.println("sum: " + sum);
        // Use Scanner sc = new Scanner(System.in);
        // to get user input --> sc.nextInt()
        // Example input format 3 7 8 6
        // first digit will tell you how many digit you will have to accept from user
        // 3 - number of digits | 7,8,6  are actual digits

        // first digit can of any number
        //Sum all digits that user enters after first digit
        //Print the sum at the end

    }

}
