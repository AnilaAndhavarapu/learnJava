package com.learn.java.practice.assignments_Anila.day_6;

import com.learn.java.practice.utils.Utils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assign3 {

    public static void main(String[] args) {
        List<String> strList = Utils.generateRandomStrings(10);
        Function<String, Integer> fn = i -> i.length();
        List<Integer> countList = strList.stream()
                .peek(Utils.print())
                .map(fn)
                .peek(Utils.print()).collect(Collectors.toList());


        // Create a list of integer with count of chars in each word of above list using streams

    }
}
