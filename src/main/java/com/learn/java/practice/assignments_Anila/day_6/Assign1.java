package com.learn.java.practice.assignments_Anila.day_6;

import java.util.Calendar;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assign1 {

    public static void main(String[] args) {

        // Define a Predicate to check if a given number is even or not.
        Predicate<Integer> p = num -> num%2==0;
        System.out.println(p.test(6));

        // Define a Supplier when called returns current time.
        Supplier<Date> s = () -> Calendar.getInstance().getTime();
        System.out.println(s.get());

        // Define a Function which takes integer as an input and returns square root of number.
        Function<Integer, Double> f = (num) -> Math.pow(num, 0.5);
        System.out.println(f.apply(23));

        // Define a Consumer which takes current time as input and prints it as  "Logging current Time : " + time
        Consumer<Date> c = (time) -> System.out.println("Logging current Time : " + time);
        c.accept(Calendar.getInstance().getTime());
    }
}
