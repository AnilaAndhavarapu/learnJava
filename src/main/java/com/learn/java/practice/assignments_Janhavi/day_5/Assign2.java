package com.learn.java.practice.assignments_Janhavi.day_5;

import java.lang.String;
import java.util.Arrays;

public class Assign2 {

    public static void main(String[] args) {
        // Anagram --> write a method to check if two strings are anagram of each other or not
        // Example: --> rat and tar are anagrams
        Assign2 as=new Assign2();
        as.isAgnagram("rat","tar");

        as.isPalindromes("adda");
        // Panagram --> write a method to check if a given string sentence is panagram or not
        // A panagram is a sentence or string which uses all 26 alphabets.
        // Example : --> “The quick brown fox jumps over the lazy dog”   is a panagram

        // Palindrome --> write a method to check if a given string is a palindrome
        // Example : --> abba/ acbca are a palindromes
    }
    public void isAgnagram(String s, String s1)
    {

        char st []= s.toLowerCase().toCharArray();


        char st1 []= s1.toLowerCase().toCharArray();

        Arrays.sort(st);
        Arrays.sort(st1);


        if(Arrays.equals(st,st1))
        {
            System.out.println("String are anagrams");
        }
        else{
            System.out.println("String are not anagrams");
        }

    }

    public void isPalindromes(String s)
    {

        char st []= s.toCharArray();

        char st1[]=new char[st.length];

        for(int i=st1.length-1 ; i>=0;i--)
        {
            st1[st.length - 1 - i] = st[i];
        }

        if(Arrays.equals(st,st1))
        {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}