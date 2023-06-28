package com.learn.java.practice.assignments_Anila.day_5;

import com.learn.java.practice.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Assign4 {

    public static void main(String[] args) {
        // Write a binary search method to find index of a given word in above sorted String list.
        Random r = new Random();
        int index = r.nextInt(10);
        System.out.println(index);

        ArrayList<Integer> numList = Utils.generateRandomIntegers(10);
        numList.sort(Integer::compareTo);
        int searchIndex = binarySearchNumber(numList, numList.get(index));
        System.out.println("Num Search : " + searchIndex);

        ArrayList<String> strList = Utils.generateRandomStrings(10);
        strList.sort(String::compareTo);
        int searchIndex1 = binarySearchWord(strList, strList.get(index));
        System.out.println("Word Search : " + searchIndex1);
    }

    private static int binarySearchWord(List<String> list, String searchStr) {
        int low = 0;
        int high = list.size();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid).equals(searchStr)) {
                return mid;
            }
            if (list.get(mid).compareTo(searchStr) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    private static int binarySearchNumber(List<Integer> list, int num) {
        int low = 0;
        int high = list.size();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (num == list.get(mid)) {
                return mid;
            }

            if (num < list.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
