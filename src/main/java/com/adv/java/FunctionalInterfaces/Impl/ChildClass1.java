package com.adv.java.FunctionalInterfaces.Impl;

import com.adv.java.FunctionalInterfaces.interfaces.ParentInterface1;

public class ChildClass1 implements ParentInterface1 {

    @Override
    public void walk() {
        System.out.println("Child Class 1 abstract walk method");
    }
    @Override
    public String defautMethod() {
       //return FuncIntr1.super.defautMethod();
        return "Child Class default Method";
    }
}
