package com.learn.java.practice.assignments_Janhavi.day_3;

import com.learn.java.practice.utils.Utils;

import java.util.Arrays;

public class Assign2 {

    public static void main(String[] args) {
        //create a new int array with double (num*2) of each number in matrix array
        //create a new int array which is transpose of input matrix array

        // Note: print all arrays
        // create a common method which can take array as an input and print all numbers

        int[][] matrix = Utils.getMatrix();

        System.out.println("Row : "  + matrix.length);
        System.out.println("Column : " + matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int[][] resultMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultMatrix[i][j] = (matrix[i][j]) * 2;
            }
        }

        System.out.println(" --> Double Matrix");

        for (int i = 0; i < resultMatrix.length; i++) {
            System.out.println(Arrays.toString(resultMatrix[i]));
        }
    }
}

