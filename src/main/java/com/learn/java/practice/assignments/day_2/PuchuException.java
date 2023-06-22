package com.learn.java.practice.assignments.day_2;

public class PuchuException extends RuntimeException{
    public PuchuException(String str){
        super(str);
        System.out.println("Puchu Exception occured : " + str);
    }
}
