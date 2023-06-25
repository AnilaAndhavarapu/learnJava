package com.learn.java.practice.assignments_Janhavi.day_1;

import com.learn.java.practice.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Assign2 {

    // Split the above list into equal sized list
    // sort individual split lists
    // merge them again to form a complete sorted list
    // print the list after each step
    // Note :: do not use Collections.sort method

    public static void main(String[] args) {
        List<Integer> list = Utils.generateRandomIntegers(11);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < list.size() / 2; i++) {
            list1.add(list.get(i));
        }
        for (int i = list.size() / 2; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        Comparing(list1);
        Comparing(list2);
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i=0,j= 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }
            else{
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while(i < list1.size()){
            mergedList.add(list1.get(i));
            i++;
        }
        while(j < list2.size()){
            mergedList.add(list2.get(j));
            j++;
        }

    System.out.println(mergedList);
    }

    private static void Comparing(ArrayList<Integer> arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {

            for (int j = arraylist.size() - 1; j > i; j--) {
                if (arraylist.get(i) > arraylist.get(j)) {

                    int tmp = arraylist.get(i);
                    arraylist.set(i, arraylist.get(j));
                    arraylist.set(j, tmp);
                }
            }
        }
    }

}
