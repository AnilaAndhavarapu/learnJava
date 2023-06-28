package com.learn.java.practice.assignments_Anila.day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assign2 {

    public static void main(String[] args) {
        //anagram("qaz","az" );
        panagram("The quick brown fox jumps over the lazy dog");
        //palindrome("abbcbba");

    }

    // Anagram --> write a method to check if two strings are anagram of each other or not
    // Example: --> rat and tar are anagrams
    public static void anagram(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println("Not an Anagram");
            return;
        }
        char[] charArr1 = a.toCharArray();
        char[] charArr2 = b.toCharArray();

        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();

        for (int i = 0; i < charArr1.length; i++) {
            l1.add(charArr1[i]);
            l2.add(charArr2[i]);
        }
        Collections.sort(l1);
        Collections.sort(l2);

        if (l1.equals(l2)) {
            System.out.println("The strings are Anagram of each other");
        }
    }

    // Panagram --> write a method to check if a given string sentence is panagram or not
    // A panagram is a sentence or string which uses all 26 alphabets.
    // Example : --> “The quick brown fox jumps over the lazy dog”   is a panagram
    public static void panagram(String a) {
        if (a.length() < 26) {
            System.out.println("Not a Panagram");
            return;
        }
        a = a.toLowerCase();
        boolean[] arr1 = new boolean[26];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                continue;
            }
            arr1[a.charAt(i) - 'a'] = true;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i]) {
                count++;
            }
        }
        if (count == 26) {
            System.out.println("Panagram");
            return;
        }
        System.out.println("Not a Panagram");
    }

    // Palindrome --> write a method to check if a given string is a palindrome
    // Example : --> abba/ acbca are a palindromes
    public static void palindrome(String a) {
        int i = 0;
        int j = a.length() - 1;

        while (i < j) {
            if (a.charAt(i) == a.charAt(j)) {
                i++;
                j--;
            } else {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}







