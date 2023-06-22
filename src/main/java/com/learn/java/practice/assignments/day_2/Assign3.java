package com.learn.java.practice.assignments.day_2;

import com.learn.java.practice.utils.Utils;

public class Assign3 {

    public static void main(String[] args) {

        // create two User defined Exceptions with custom messages in day_2 package
        // 1. PinguException --> Checked Exception
        // 2. PuchuException --> Unchecked

        // if string starts with vowel throw PinguException else PuchuException
        // catch the Exception and add a print statement to print the message
        // your exception should not break the for loop
        // it should catch the exception print the message and continue to next element

        //Note: Main method should not throw anything in method signature
        // All exceptions should be handled within the main method
        // Check the string type and handle exceptions using try catch
        // try - catch should be within this for loop

        for (int i = 0; i < 10; i++) {
            String str = Utils.generateRandomStrings(1).get(0);
            System.out.println(str);

            boolean result = false;

            if (str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o") || str.startsWith("u") ||
                    str.startsWith("A") || str.startsWith("E") || str.startsWith("I") || str.startsWith("O") || str.startsWith("U")) {
                result = true;
            }

            try {
                if (result)
                    throw new PinguException("The string is vowel");
                else
                    throw new PuchuException("The string is not vowel");
            } catch (PuchuException e) {

            } catch (PinguException e) {

            }
        }

    }
}
