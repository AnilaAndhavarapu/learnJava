package com.learning.practice.assignments_Anila.day_6;

import com.learning.practice.utils.Utils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assign4 {

    public static void main(String[] args) {
        List<Integer> intList = Utils.generateRandomIntegers(10);
        Predicate<Integer> p = i -> i % 2 == 1;
        List<Integer> oddList = intList.stream().peek(Utils.print())
                                .filter(p)
                                .peek(Utils.printWithPrefix("Odd ->"))
                                .collect(Collectors.toList());




        // Create a list with only odd numbers from above list using streams and predicate functional interface.
    }
}
