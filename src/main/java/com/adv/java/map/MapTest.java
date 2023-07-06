package com.adv.java.map;

import com.learn.java.practice.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        HashMap<String, String> map = Utils.generateRandomStrToStrMap(10);

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + " -- " + "Value : " + entry.getValue());
            if(entry.getKey().equals("abc")){
                entry.setValue("def");
            }
        }

        map.keySet();
        map.containsKey("abc");
        map.putIfAbsent("abc", "def");
        map.computeIfAbsent("abc", s -> s.toLowerCase());
        map.values();

    }
}
