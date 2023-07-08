package com.learning.practice.assignments_Anila.day_4;

public class Assign3 {

    public static void main(String[] args) {

        //Write 3 sum methods
        // 1. input two double values and return double value
        // 2. input one int and one double value and return double value
        // 3. input two int values and return double value
       Assign3 as3 = new Assign3();
       System.out.println(as3.sum(1.5,5.3));
       System.out.println(as3.sum(1,5));
       System.out.println(as3.sum(1.5,5));
    }
    public double sum(double a, double b){
      return a+b;
    }
    public int sum(int a, int b){
        return a+b;
    }
    public double sum(double a, int b){
        return a+b;
    }
}
