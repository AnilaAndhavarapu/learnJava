package com.adv.java;

@FunctionalInterface
public interface FunctionalInterfaceTest {

    void fooBar();

    static String doSomething(){
        return "Action Performed";
    }

    default String createSomething(){
        return "Created a wonderful Functional Interface";
    }
}
