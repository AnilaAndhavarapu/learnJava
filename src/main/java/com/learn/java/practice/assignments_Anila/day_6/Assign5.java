package com.learn.java.practice.assignments_Anila.day_6;

import com.learn.java.practice.assignments_Anila.day_6.enums.Seasons;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.learn.java.practice.assignments_Anila.day_6.enums.Seasons.*;

public class Assign5 {

    public static void main(String[] args) {

        List<Seasons> seasonsList = Arrays.asList(AUTUMN, WINTER, SUMMER, WINTER, SPRING, SUMMER, RAINY, AUTUMN, WINTER);
        int autumnCount = seasonsList.stream().filter(predicateMethod(Seasons.AUTUMN)).collect(Collectors.toList()).size();
        int winterCount = seasonsList.stream().filter(i -> i.equals(Seasons.WINTER)).collect(Collectors.toList()).size();
        int summerCount = seasonsList.stream().filter(i -> i.equals(Seasons.SUMMER)).collect(Collectors.toList()).size();
        int springCount = seasonsList.stream().filter(i -> i.equals(Seasons.SPRING)).collect(Collectors.toList()).size();
        int rainyCount = seasonsList.stream().filter(i -> i.equals(Seasons.RAINY)).collect(Collectors.toList()).size();

        System.out.println(autumnCount);
        System.out.println(winterCount);
        System.out.println(summerCount);
        System.out.println(springCount);
        System.out.println(rainyCount);

        // Get count of each season in above list in separate variables using streams.
        // Note: don't use map
    }
    public static Predicate<Seasons> predicateMethod(Seasons x){
        return i -> i.equals(x);
    }

}
