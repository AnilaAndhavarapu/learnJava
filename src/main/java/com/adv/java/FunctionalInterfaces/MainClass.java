package com.adv.java.FunctionalInterfaces;

import com.adv.java.FunctionalInterfaces.Impl.Child1ActionClass;
import com.adv.java.FunctionalInterfaces.interfaces.ActionInterface1;
import com.adv.java.FunctionalInterfaces.interfaces.ActionInterface2;

import java.util.function.Supplier;

public class MainClass {
    public static void main(String[] args) {
//        Parent obj = new Child();
//        System.out.println(obj.method1());
//        System.out.println(obj.method2());
//        System.out.println(obj.method3());

//        ParentInterface obj = new ChildClass2();
//        System.out.println(obj.defautMethod());
//        obj.walk();
//        System.out.println(ParentInterface.staticMethod());

//        ActionInterface1 obj = new Child1ActionClass();
//        System.out.println(obj.action());
//
//        ActionInterface1 obj1 = () -> "Lambda Child action method";
//        System.out.println(obj1.action());
//
//        ActionInterface2 obj5 = (q, w) -> q + w;
//        obj5.sum(10, 20);
//
//        ActionInterface2 obj6 = new ActionInterface2(){
//            @Override
//            public int sum(int a, int b) {
//                return a+b;
//            }
//        };
//        obj6.sum(10, 20);


        Supplier<String> supplier = () -> "Supplied String";
        System.out.println(supplier.get());

        Supplier<Integer> supplier2 = () -> 10+20;
        System.out.println(supplier2.get());

    }


}
