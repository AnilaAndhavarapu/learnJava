package com.learn.java.practice.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Utils {

    private static Random random = new Random();
    private static final String DICTIONARY_FILE_PATH = "src/main/resources/static/dictionary.txt";

    public static ArrayList<String> generateRandomStrings(int count){
        List<String> dictionary = loadDictionary();
        int dictionarySize = dictionary.size();
        ArrayList<String> generatedObjects = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(dictionarySize);
            String randomWord = dictionary.get(randomIndex);
            generatedObjects.add(randomWord);
        }

        return generatedObjects;
    }

    public static ArrayList<Integer> generateRandomIntegers(int count){
        ArrayList<Integer> generatedObjects = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            generatedObjects.add(random.nextInt(100));
        }
        return generatedObjects;
    }

    private static List<String> loadDictionary() {
        List<String> dictionary = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(DICTIONARY_FILE_PATH));
            String line;

            while ((line = reader.readLine()) != null) {
                dictionary.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dictionary;
    }

    public static int[][] getMatrix(){
        Random random = new Random();
        int i = 5;
        int j = 4;

        int[][] matrix = new int[i][j];

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                matrix[k][l] = random.nextInt(200);
            }
        }
        return matrix;
    }

    public static String getRandomSentence(int length){
        ArrayList<String> list = generateRandomStrings(length);
        String SPACE = " ";
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
            sb.append(SPACE);
        }
        return sb.toString().trim();
    }

    public static void print(String str){
        System.out.println(str);
    }

}

