package com.learning.java.FunctionalInterfaces.interfaces;

@FunctionalInterface
public interface ParentInterface1 {

    void walk();

    static String staticMethod(){
        return "Parent Interface static method";
    }

    default String defautMethod(){
        return "Parent Interface default Method";
    }

}
