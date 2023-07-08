package com.learning.practice.assignments_Anila.day_2;

public class PinguException extends Exception{

    public PinguException(String str) {
        super(str);
        System.out.println("Pingu Exception occured : " + str );
    }
}
