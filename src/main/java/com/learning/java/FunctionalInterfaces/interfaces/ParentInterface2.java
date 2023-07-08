package com.learning.java.FunctionalInterfaces.interfaces;

@FunctionalInterface
public interface ParentInterface2 {

    void dance();

    static String staticMethod(){
        return "Parent Interface static method";
    }

    default String defautMethod(){
        return "Parent Interface default Method";
    }

}
