package com.adv.java.FunctionalInterfaces.Impl;

import com.adv.java.FunctionalInterfaces.interfaces.ParentInterface1;
import com.adv.java.FunctionalInterfaces.interfaces.ParentInterface2;

public class ChildClass3 implements ParentInterface1, ParentInterface2 {
    @Override
    public void walk() {
        System.out.println("Child 3 walk method");
    }

    @Override
    public void dance() {
        System.out.println("Child 3 dance method");
    }

    @Override
    public String defautMethod() {
        System.out.println("Child 3 method call redirecting to Parent Interface default method");
        return ParentInterface2.super.defautMethod();
    }
}
