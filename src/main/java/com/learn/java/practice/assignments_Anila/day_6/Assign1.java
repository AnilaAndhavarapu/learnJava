package com.learn.java.practice.assignments_Anila.day_6;

public class Assign1 {

    static String s;

    public Assign1(String s) {
        this.s = s;
    }

    public static void walk(){
        System.out.println("walk : " + s);
    }

    private void dance(){
        System.out.println("Dance : " + s);
    }

    public static void main(String[] args) {

        Assign1 obj = new Assign1("Pingu Dance");
        obj.dance();

        Assign1 obj1 = new Assign1("Jingu Dance");
        obj1.dance();

        obj.dance();

        Assign1.walk();
    }
}
