package com.learning.practice.assignments_Anila.day_10;

import java.util.HashMap;
import java.util.Stack;

public class Assign_2 {
     String str = "{([[{}{}]])}";
    public static void main(String[] args) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        System.out.println(new Assign_2().bracketOrder(brackets));
    }

    public  boolean bracketOrder(HashMap map) {
        Stack<Character> charstack = new Stack<>();
        //charstack.addAll(str.toCharArray());
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                charstack.push(str.charAt(i));
            } else if (str.charAt(i) == (char) map.get(charstack.peek())) {
                charstack.pop();
            }
        }
        return charstack.isEmpty();
    }

}
