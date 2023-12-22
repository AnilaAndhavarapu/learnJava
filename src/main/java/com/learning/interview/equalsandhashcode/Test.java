package com.learning.interview.equalsandhashcode;

public class Test {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Pingu");
        Employee e2 = new Employee(1, "Pingu");

        System.out.println("Address compare or Shallow compare : " + (e1 == e2));
        System.out.println("Object compare or Deep compare : " + (e1.equals(e2)));
        System.out.println("Hash code e1 : " + e1.hashCode() + " ||  e2: " + e2.hashCode());

        // if 2 objects are equal then their hash code should be equal

    }
}
