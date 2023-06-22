package com.learn.java.practice.assignments.day_2;

import com.learn.java.practice.utils.Utils;
import com.learn.java.practice.vo.Jingu;

import java.util.ArrayList;
import java.util.List;

public class Assign1 {

    public static void main(String[] args) {
        List<Integer> numList = Utils.generateRandomIntegers(10);
        List<String> strList = Utils.generateRandomStrings(10);
        // implement Jingu class in vo package, it should have two attributes one integer and one string
        // Write two constructors -> No arg constructor and Ar constructor
        // Attributes should be private
        // Write getter and setters for both of the attributes

        ArrayList<Jingu> jinguList = new ArrayList<>();

        // create 10 objects of jingu using numList and strList and add them to jinguList
        for(int i=0; i<numList.size(); i++){
            if(i%2==0) {
                jinguList.add(new Jingu(numList.get(i), strList.get(i)));
            }
            else{
                Jingu j1 = new Jingu();
                j1.setnumber(numList.get(i));
                j1.setname(strList.get(i));
                jinguList.add(j1);
            }
        }
        System.out.println(jinguList);
    }
}

