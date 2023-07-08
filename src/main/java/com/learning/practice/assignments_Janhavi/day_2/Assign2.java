package com.learning.practice.assignments_Janhavi.day_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Assign2 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20);
        }

        // Use above array to create a Linked list and an Array List
        // Linked list should have all odd numbers
        // Array list will have all even numbersList

        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                al.add(arr[i]);
            } else {
                ll.add(arr[i]);
            }
        }
        System.out.println("ll:" + ll);
        System.out.println("al:" + al);
    }
}
