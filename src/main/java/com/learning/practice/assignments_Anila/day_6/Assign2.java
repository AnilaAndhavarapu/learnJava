package com.learning.practice.assignments_Anila.day_6;

import com.learning.practice.utils.Utils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assign2 {

    public static void main(String[] args) {
        List<Integer> integerList = Utils.generateRandomIntegers(10);

        // Create a stream from above list and convert each number in list to square of the number
        // Also define Function functional interface for the above

        Function<Integer, Integer> fn = (num) -> num * num;
        List<Integer> squareList = integerList.stream().map(fn).collect(Collectors.toList());
        System.out.println(squareList);

    }
}
