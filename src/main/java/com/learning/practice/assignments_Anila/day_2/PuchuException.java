package com.learning.practice.assignments_Anila.day_2;

public class PuchuException extends RuntimeException{
    public PuchuException(String str){
        super(str);
        System.out.println("Puchu Exception occured : " + str);
    }
}
