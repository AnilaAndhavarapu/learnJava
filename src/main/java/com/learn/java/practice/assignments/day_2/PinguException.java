package com.learn.java.practice.assignments.day_2;

public class PinguException extends Exception{

    public PinguException(String str) {
        super(str);
        System.out.println("Pingu Exception occured : " + str );
    }
}
