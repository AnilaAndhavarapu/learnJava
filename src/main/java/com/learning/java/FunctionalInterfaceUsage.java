package com.learning.java;

public class FunctionalInterfaceUsage {

    public static void main(String[] args) {

        FunctionalInterfaceTest fi1 = () -> System.out.println("Lambda based implementation of foo bar method");
        FunctionalInterfaceTest fi2 = new FuncInterfaceImpl();

        fi1.fooBar();
        fi2.fooBar();

    }
}

class FuncInterfaceImpl implements FunctionalInterfaceTest{

    @Override
    public void fooBar() {
        System.out.println("Class based implementation of foo bar method");
    }
}
