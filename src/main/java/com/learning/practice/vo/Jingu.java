package com.learning.practice.vo;

public class Jingu {

    private int number;
    private String name;

    public Jingu(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public Jingu() {
    }

    public int getnumber() {
        return number;
    }

    public void setnumber(int num) {
        number = num;
    }

    public String getname() {
        return name;
    }

    public void setname(String N) {
        name = N;
    }

    @Override
    public String toString() {
        return "{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
